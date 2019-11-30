### 动态数组容器类ArrayList
[toc]

#### 基本用法
```
ArrayList是一个泛型容器，新建需要实例化泛型化参数

主要方法：
public boolean add(E e) // 添加至末尾
public boolean isEmpty() // 返回是否为空
public int size() 
public E get(int index) // 访问指定位置元素
public int indexOf(Object o) // 查找元素索引位置，找不到返回-1
public int lastIndexOf(Object o) // 从后往前找
public boolean contains(Object o) // 是否包含指定元素
public E remove(int index) // 删除指定位置元素，返回所删除的元素
public boolean remove(Object o)  //只删除第一个相同的对象，o为null，则删除值为null的元素
public void clear() // 删除所有
public void add(int index, E element) //指定位置插入元素
public E set(int index, E element) // 修改指定位置元素
```
#### add()、remove()源码解析
Arraylist类内部有一个数组elementData,具备一定的长度，整数size记录实际元素个数
``` java
transient Object[] elementData;   //elementData会随着实际元素的增多而重新分配
private int size;   
private static final int MAX_ARRAY_SIZE = 2147483639;
```
---
 * 以下函数源码按序给出，并标记注释
---

###### add()

```java
public boolean add(E e) {
    ++this.modCount;   // modCount 表示内部的修改次数
    this.add(e, this.elementData, this.size);  //确保数组容量是足够的
    return true;
}
private void add(E e, Object[] elementData, int s) {
        if (s == elementData.length) { 
            elementData = this.grow();       //没有多余的空间则调用grow()进行分配空间
        }
        elementData[s] = e;
        this.size = s + 1;
    }

private Object[] grow() {
        return this.grow(this.size + 1);
    }

private Object[] grow(int minCapacity) {
        /*
        Arrays.copyOf用于复制指定的数组内容以达到扩容的目的 ，返回复制后的数组，
        参数是被复制的数组和复制的长度：
        */
        return this.elementData = Arrays.copyOf(this.elementData, this.newCapacity(minCapacity));
    }

private int newCapacity(int minCapacity) {
        int oldCapacity = this.elementData.length;

        //右移一位，相当于 原数/2，则newCapacity = 1.5* oldCapacity
        int newCapacity = oldCapacity + (oldCapacity >> 1);

        // 扩容后新容量和需要的长度进行比较
        if (newCapacity - minCapacity <= 0) {
            /*
            private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = new Object[0];
            public ArrayList() {this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;}
            所以 新建elementData时，默认构造函数将其置空
            */

            if (this.elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
                return Math.max(10, minCapacity);
            } else if (minCapacity < 0) {
                throw new OutOfMemoryError();
            } else {
                return minCapacity;
            }
        } else {
            /*
             所需容量  < 扩容后新容量  <  最大容量  ,则返回扩容后长度，
             如果大于最大容量，调用hugeCapacity方法检查容量的int值是不是已经溢出
            */
            return newCapacity - 2147483639 <= 0 ? newCapacity : hugeCapacity(minCapacity);
        }
    }
```
###### remove()
```java
public E remove(int index) {
        //检查输入的索引号是否合法
        Objects.checkIndex(index, this.size);
        Object[] es = this.elementData;
        E oldValue = es[index];
        this.fastRemove(es, index);
        return oldValue;  //返回删除 索引位置元素
    }

private void fastRemove(Object[] es, int i) {
        ++this.modCount;
        int newSize;
        if ((newSize = this.size - 1) > i) {
            // 调用System.arraycopy方法移动元素
            System.arraycopy(es, i + 1, es, i, newSize - i);
        }
        //将最会一个位置设为null
        es[this.size = newSize] = null;
    }
```


#### 迭代操作

#### 实现的接口(Collection、List、RandAccess)
```java
public class ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, Serializable
```
![](https://upload-images.jianshu.io/upload_images/10460153-8fa0edc46bf54aa4.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

#### 特点