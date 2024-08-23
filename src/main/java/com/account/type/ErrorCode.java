package com.account.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_NOT_FOUND("사용자가 없습니다."),
    ACCOUNT_NOT_FOUND("해당 계좌가 없습니다."),
    USER_ACCOUNT_UN_MATCH("사용자와 계좌의 소유주가 다릅니다."),
    ACCOUNT_ALREADY_UNREGISTERED("계좌가 이미 해지되었습니다."),
    ACCOUNT_HAS_BALANCE("잔액이 있는 계좌는 해지할 수 없습니다."),
    AMOUNT_EXCEED_BALANCE("거래금액이 잔액보다 큽니다."),
    MAX_COUNT_PER_USER("사용자가 최대 계좌는 10개 입니다.");

    private final String description;
}
