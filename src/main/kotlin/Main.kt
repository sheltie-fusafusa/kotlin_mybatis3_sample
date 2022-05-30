import dto.TestDto
import org.apache.ibatis.io.Resources
import org.apache.ibatis.session.SqlSessionFactoryBuilder

fun main(args: Array<String>) {

    val sqlSessionFactory = SqlSessionFactoryBuilder()
                            .build(Resources.getResourceAsStream("mybatis-config.xml"))

    sqlSessionFactory.openSession().use { session ->
        val result = session.selectOne<TestDto>("selectById", 1)
        println(result.toString())
    }
}