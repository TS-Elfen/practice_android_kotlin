package com.example.practiceandroid.infra.word

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

/**
 * SQLクエリを指定してメソッド呼び出しに関連付けるIF。
 * @Query,@Insert,@Delete,@Updateなどのアノテーションをつけると
 * コンパイラによってSQLのチェックとクエリの生成が行われる。
 * @Query以外はQuery文を入れる必要はない
 *
 * Queryに引数を入力する方法: (List<hoge>:) hoge:
 */
@Dao
interface WordDAO {
    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAlphabetizedWords(): Flow<List<WordEntity>>
    //OnConflictStrategy：競合戦略の指定　上書きとかがある
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: WordEntity)
    @Query("DELETE FROM word_table")
    suspend fun deleteAll()
}