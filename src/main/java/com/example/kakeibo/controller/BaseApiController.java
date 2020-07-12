package com.example.kakeibo.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

public class BaseApiController {

	private static final Logger baseLog = LogManager.getLogger(BaseApiController.class);

	@Autowired
	private HttpServletRequest httpServletRequest;

	/**
	 * レスポンスエンティティを生成（コンテンツタイプ：application/json）
	 * 
	 * @param status ステータスコード
	 * @return レスポンスエンティティ
	 */
	protected ResponseEntity<ApiResponse> createResponse(HttpStatus status) {
		return new ResponseEntity<ApiResponse>(null, httpHeaders(), status);
	}

	/**
	 * レスポンスエンティティを生成（コンテンツタイプ：application/json）
	 * 
	 * @param response レスポンスデータ
	 * @return レスポンスエンティティ      
	 */
	protected ResponseEntity<ApiResponse> createResponse(HttpStatus status, ApiResponse response) {
		return new ResponseEntity<ApiResponse>(response, httpHeaders(), status);
	}

	/**
	 * 例外ハンドリング
	 * 
	 * @param ex 例外
	 * @return レスポンスエンティティ      
	 */
	@ExceptionHandler({ Exception.class })
	@ResponseBody
	public ResponseEntity<ApiResponse> handleException(Exception ex) {
		// ログ出力
		baseLog.error("catch the <@ExceptionHandler>", ex);
		return new ResponseEntity<ApiResponse>(null, httpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	/**
	 * HTTPヘッダ情報を作成
	 * 
	 * @return HTTPヘッダ情報      
	 */
	private HttpHeaders httpHeaders() {
		// HTTPヘッダの設定 
		HttpHeaders headers = new HttpHeaders();
		// Content-Type
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}
}
