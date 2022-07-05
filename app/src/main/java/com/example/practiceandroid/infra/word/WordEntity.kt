package com.example.practiceandroid.infra.word

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * 各プロパティがデータベースのカラムに相当する。
 * 主キー指定：@PrimaryKey
 *          :ちなみにautoGenerate=true　オプションを使うと一意のキーが自動生成される
 * カラム指定：@ColumnInfo
 * テーブル名：@EntityのtableNameプロパティ（いじらないとクラス名）
 */
@Entity(tableName = "word_table")
data class WordEntity (
    @PrimaryKey @ColumnInfo(name = "word") val word :String
    )