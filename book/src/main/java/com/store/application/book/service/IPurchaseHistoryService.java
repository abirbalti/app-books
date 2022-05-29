package com.store.application.book.service;

import com.store.application.book.model.PurchaseHistory;
import com.store.application.book.repository.projection.IPurchaseItem;

import java.util.List;


public interface IPurchaseHistoryService
{
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
