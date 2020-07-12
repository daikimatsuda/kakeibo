package com.example.kakeibo.form;

import lombok.Getter;
import lombok.Setter;

public class MoneyForm {

	/* 品目名 */
	@Getter
	@Setter
	private String ItemName;
	
	/* カテゴリID */
	@Getter
	@Setter
	private String categoryId;
	
	/* カテゴリ名 */
	@Getter
	@Setter
	private String categoryName;
	
	/* 金額 */
	@Getter
	@Setter
	private String money;
	
	/* メモ */
	@Getter
	@Setter
	private String memo;

	/* 日付 */
	@Getter
	@Setter
	private String date;
	
	/* 店名 */
	@Getter
	@Setter
	private String storeName;
	
	
	
	
	
}
