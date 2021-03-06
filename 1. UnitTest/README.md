# ๐ ๋จ์ํ์คํธ๋?

## main method

#### main method์ ์ฉ๋

- ํ๋ก๊ทธ๋จ์ ์์
- ๊ตฌํํ ํ๋ก๊ทธ๋จ์ ํ์คํธ

> ์ด ๋จ๋ฝ์ main method๋ฅผ ํ์คํธ ์ฉ๋๋ก ์ฌ์ฉํ๋ ๊ฒฝ์ฐ์ ๋ํด ๋ค๋ฃจ๊ณ  ์๋ค.

#### ๋ง๋ณด๊ธฐ ํ๋ก๊ทธ๋จ ๊ตฌํ

- ์ฌ์น์ฐ์ฐ์ด ๊ฐ๋ฅํ ๊ณ์ฐ๊ธฐ
  - ๋ง์(add)
  - ๋บ์(subtract)
  - ๊ณฑ์(multiply)
  - ๋๋์(divide)
- ์ 4๊ฐ์ ๊ธฐ๋ฅ์ ๊ตฌํํ๊ณ  main method๋ฅผ ํ์ฉํด ํ์คํธํ๋ค.

![main_test.PNG](README.assets/main_test.PNG)

- ์ ๊ทธ๋ฆผ์ ํตํด ํ์ธํ  ์ ์๋ฏ์ด **ํ๋ก๋์ ์ฝ๋(Production Code)** ํ๋ก๊ทธ๋จ ๊ตฌํ์ ๋ด๋นํ๋ ๋ถ๋ถ์ผ๋ก ์ฌ์ฉ์๊ฐ ์ค์ ๋ก ์ฌ์ฉํ๋ ์์ค ์ฝ๋๋ฅผ ์๋ฏธํ๋ค.
- **ํ์คํธ ์ฝ๋(test code)** ๋ ํ๋ก๋์ ์ฝ๋๊ฐ ์ ์์ ์ผ๋ก ๋์ํ๋์ง๋ฅผ ํ์ธํ๋ ์ฝ๋์ด๋ค.

#### main method ํ์คํธ ๋ฌธ์ ์ 

- Production code์ Test Code๊ฐ ํด๋์ค ํ๋์ ์กด์ฌํ๋ค. ํด๋์ค ํฌ๊ธฐ๊ฐ ์ปค์ง. ๋ณต์ก๋ ์ฆ๊ฐํจ.
- Test Code๊ฐ ์ค ์๋น์ค์ ๊ฐ์ด ๋ฐฐํฌ๋จ.
- main method ํ๋์์ ์ฌ๋ฌ ๊ฐ์ ๊ธฐ๋ฅ์ ํ์คํธ ํจ. ๋ณต์ก๋ ์ฆ๊ฐ.
- method ์ด๋ฆ์ ํตํด ์ด๋ค ๋ถ๋ถ์ ํ์คํธํ๋์ง์ ๋ํ ์๋๋ฅผ ๋๋ฌ๋ด๊ธฐ ํ๋ฆ.
- ํ์คํธ ๊ฒฐ๊ณผ๋ฅผ ์ฌ๋์ด ์๋์ผ๋ก ํ์ธ

## JUnit

- main method๋ฅผ ํ์ฉํด ํ์คํธํ  ๋ ๋ฐ์ํ๋ ๋ฌธ์ ์ ์ ํด๊ฒฐํ๊ธฐ ์ํด ๋ฑ์ฅํ ๋๊ตฌ๊ฐ [JUnit](http://junit.org/)์ด๋ค.

#### JUnit 5.x ๋ฒ์ 

- ์ ๋ธํ์ด์(Annotation)์ ํ์ฉํด ํ์คํธ ์ฝ๋ ๊ตฌํ
  - @Test
  - @BeforeEach, @AfterEach
  - Assertions ํด๋์ค์ static assert method๋ฅผ ํ์ฉํด ํ์คํธ ๊ฒฐ๊ณผ ๊ฒ์ฆ

```java
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class study.CalculatorTest {
    Calculator cal;

    @BeforeEach
    public void setUp()  {
        cal = new Calculator();
    }

    @Test
    public void ๋ง์()  {
        assertEquals(7, cal.add(3, 4));
    }

    @Test
    public void ๋บ์()  {
        assertEquals(1, cal.subtract(5,  4));
    }

    @Test
    public void ๊ณฑ์()  {
        assertEquals(6, cal.multiply(2, 3));
    }

    @Test
    public void ๋๋์()  {
        assertEquals(2, cal.divide(8, 4));
    }

    @AfterEach
    public void tearDown() {
        cal = null;
    }
}
```

#### JUnit 4.x ๋ฒ์ 

- ์ ๋ธํ์ด์(Annotation)์ ํ์ฉํด ํ์คํธ ์ฝ๋ ๊ตฌํํ๋ ๋ฐฉ๋ฒ์ JUnit 5.x์ ๊ฐ์
- ์ ๋ธํ์ด์์ ํจํค์ง ์์น์ ์ด๋ฆ๋ง ๋ค๋ฆ. ๋ค๋ฅธ ๋ถ๋ถ์ 5.x์ ๊ฐ์
  - @org.junit.Test
  - @org.junit.Before, @org.junit.After
  - Assert ํด๋์ค์ static assert method๋ฅผ ํ์ฉํด ํ์คํธ ๊ฒฐ๊ณผ ๊ฒ์ฆ

#### method ์คํ ์์

- ๋ค์๊ณผ ๊ฐ์ JUnit ํ์คํธ๋ฅผ ์คํํ  ๊ฒฝ์ฐ ์คํ ์์๋ ์ด๋ป๊ฒ ๋ ๊น?

```java
public class study.CalculatorTest {
    @Before
    public void setup() {
      System.out.println("setup");
    }
    
    @Test
    public void test1() throws Exception {
      System.out.println("test1");		
    }
    
    @Test
    public void test2() throws Exception {
      System.out.println("test2");		
    }
    
    @After
    public void teardown() {
      System.out.println("teardown");		
    }
}
```

> before -> 1 -> after -> before -> 2 -> after



# ์์์ ์ธ ์ฐ์ต์ ํ๋ผ

## ์์์ ์ธ ์ฐ์ต์ 7๊ฐ์ง ์์น

1. ํจ๊ณผ์ ์ธ ํ๋ จ๊ธฐ๋ฒ์ด ์๋ฆฝ ๋์ด ์๋ ๊ธฐ์  ์ฐ๋ง 
2. ๊ฐ์ธ์ ์ปดํฌํธ์กด์ ๋ฒ์ด๋ ์ง์ ์์ ์งํ, ์์ ์ ํ์ฌ ๋ฅ๋ ฅ์ ์ด์ง ๋์ด๊ฐ๋ ์์์ ์ง์์ ์ผ๋ก ์๋
3. ๋ชํํ๊ณ  ๊ตฌ์ฒด์ ์ธ ๋ชฉํ๋ฅผ ๊ฐ์ง๊ณ  ์งํ
4. ์ ์คํ๊ณ  ๊ณํ์ ์ด๋ค. ์ฆ, ๊ฐ์ธ์ด ์จ์ ํ ์ง์คํ๊ณ  '์์์ '์ผ๋ก ํ๋ ํ  ๊ฒ ์ ์๊ตฌ
5. ํผ๋๋ฐฑ๊ณผ ํผ๋๋ฐฑ์ ๋ฐ๋ฅธ ํ๋ ๋ณ๊ฒฝ์ ์๋ฐ 
6. ํจ๊ณผ์ ์ธ ์ฌ์  ํ์์ ๋ง๋ค์ด ๋ด๋ ํํธ์ผ๋ก ์ฌ์  ํ์์ ์์กด 
7. ๊ธฐ์กด์ ์ต๋ํ ๊ธฐ์ ์ ํน์  ๋ถ๋ถ์ ์ง์ค์ ์ผ๋ก ๊ฐ์ ํจ์ผ๋ก์จ ๋ฐ์ ์ํค๊ณ , ์์ ํ๋ ๊ณผ์ ์ ์๋ฐ

### ***TDD, ๋ฆฌํฉํ ๋ง == ์ด๋***

### ***ํ์๋์ ์ฐ์ตํ๊ฒ ๋ค๋ ๋ง์๊ฐ์ง์ผ๋ก ์์***



## 1. ๋จ์ํ์คํธ

> ๋ด๊ฐ ์ฌ์ฉํ๋ API ์ฌ์ฉ๋ฒ์ ์ตํ๊ธฐ ์ํ ํ์ต ํ์คํธ์์ ์์

- ์๋ฐ String ํด๋์ค์ ๋ค์ํ ๋ฉ์๋(ํจ์) ์ฌ์ฉ๋ฒ
- ์๋ฐ ArrayList์ ๋ฐ์ดํฐ๋ฅผ ์ถ๊ฐ, ์์ , ์ญ์ ํ๋ ๋ฐฉ๋ฒ

```java
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    
 @Test
 public void split() {
 	String[] values = "1".split(",");
 	assertThat(values).contains("1");
 	values = "1,2".split(",");
 	assertThat(values).containsExactly("1", "2");
 }
    
 @Test
 public void substring() {
 	String input = "(1,2)";
 	String result = input.substring(1, input.length() - 1);
 	assertThat(result).isEqualTo("1,2");
 }
}
```

```java
import org.junit.Test;
import java.util.ArrayList;
import static org.assertj.core.api.Assertions.assertThat;

public class CollectionTest {
    
 @Test
 public void arrayList() {
     ArrayList<String> values = new ArrayList<>();
     values.add("first");
     values.add("second");
     assertThat(values.add("third")).isTrue();
     assertThat(values.size()).isEqualTo(3);
     assertThat(values.get(0)).isEqualTo("first");
     assertThat(values.contains("first")).isTrue();
     assertThat(values.remove(0)).isEqualTo("first");
     assertThat(values.size()).isEqualTo(2);
     }
} 
```



### ๋จ์ ํ์คํธ ์ฐ์ต

- ๋ด๊ฐ ๊ตฌํํ๋ ๋ฉ์๋(ํจ์)์ค Input๊ณผ Output์ด ๋ชํํ ํด๋์ค ๋ฉ์๋(๋ณดํตUtil์ฑ๊ฒฉ์๋ฉ์๋)์ ๋ํ ๋จ์ ํ์คํธ ์ฐ์ต
- ์๊ณ ๋ฆฌ์ฆ์ ํ์ต ํ๋ค๋ฉด ์๊ณ ๋ฆฌ์ฆ ๊ตฌํ์ ๋ํ ๊ฒ์ฆ์ ๋จ์ ํ์คํธ๋ก ํ๋ค. ์๊ณ ๋ฆฌ์ฆ์ Input, Output์ด ๋ชํํ๊ธฐ ๋๋ฌธ์ ์ฐ์ตํ๊ธฐ ์ข๋ค.





## Strike-Ball Game

## ๊ตฌํ ๊ธฐ๋ฅ ๋ชฉ๋ก

1. ๊ฒ์ ์์ / ๋ฐ๋ณต, ์ข๋ฃ ๊ธฐ๋ฅ
   1. ์ข๋ฃ ํ์ ๋ค์ ํ ๊ป์ง ๋๋ผ๊ฑด์ง ๋ฌผ์ด๋ด
2. ์ซ์ ์์ฑ ๊ธฐ๋ฅ
   1. ์ค๋ณต ์์ด ์ธ์๋ฆฌ ์
3. ์ซ์ ์๋ ฅ์ ๊ฒฐ๊ณผ ์ถ๋ ฅ๊ธฐ๋ฅ
   1. ๋ง์ถ๋ฉด ์ข๋ฃ 
   2. ํ๋ฆฌ๋ฉด ๋ฐ๋ณต