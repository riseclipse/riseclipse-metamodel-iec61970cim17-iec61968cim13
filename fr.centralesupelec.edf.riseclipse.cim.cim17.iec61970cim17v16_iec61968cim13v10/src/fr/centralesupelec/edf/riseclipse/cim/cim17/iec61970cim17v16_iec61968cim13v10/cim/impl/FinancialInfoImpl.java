/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntegerQuantity;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Financial Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FinancialInfoImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FinancialInfoImpl#getActualPurchaseCost <em>Actual Purchase Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FinancialInfoImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FinancialInfoImpl#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FinancialInfoImpl#getFinancialValue <em>Financial Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FinancialInfoImpl#getPlantTransferDateTime <em>Plant Transfer Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FinancialInfoImpl#getPurchaseDateTime <em>Purchase Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FinancialInfoImpl#getPurchaseOrderNumber <em>Purchase Order Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FinancialInfoImpl#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FinancialInfoImpl#getWarrantyEndDateTime <em>Warranty End Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FinancialInfoImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FinancialInfoImpl#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinancialInfoImpl extends IdentifiedObjectImpl implements FinancialInfo {
    /**
     * The default value of the '{@link #getAccount() <em>Account</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccount()
     * @generated
     * @ordered
     */
    protected static final String ACCOUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAccount() <em>Account</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccount()
     * @generated
     * @ordered
     */
    protected String account = ACCOUNT_EDEFAULT;

    /**
     * This is true if the Account attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean accountESet;

    /**
     * The default value of the '{@link #getActualPurchaseCost() <em>Actual Purchase Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActualPurchaseCost()
     * @generated
     * @ordered
     */
    protected static final BigDecimal ACTUAL_PURCHASE_COST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getActualPurchaseCost() <em>Actual Purchase Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActualPurchaseCost()
     * @generated
     * @ordered
     */
    protected BigDecimal actualPurchaseCost = ACTUAL_PURCHASE_COST_EDEFAULT;

    /**
     * This is true if the Actual Purchase Cost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean actualPurchaseCostESet;

    /**
     * The default value of the '{@link #getCostDescription() <em>Cost Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCostDescription()
     * @generated
     * @ordered
     */
    protected static final String COST_DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCostDescription() <em>Cost Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCostDescription()
     * @generated
     * @ordered
     */
    protected String costDescription = COST_DESCRIPTION_EDEFAULT;

    /**
     * This is true if the Cost Description attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean costDescriptionESet;

    /**
     * The default value of the '{@link #getCostType() <em>Cost Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCostType()
     * @generated
     * @ordered
     */
    protected static final String COST_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCostType() <em>Cost Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCostType()
     * @generated
     * @ordered
     */
    protected String costType = COST_TYPE_EDEFAULT;

    /**
     * This is true if the Cost Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean costTypeESet;

    /**
     * The default value of the '{@link #getFinancialValue() <em>Financial Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinancialValue()
     * @generated
     * @ordered
     */
    protected static final BigDecimal FINANCIAL_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFinancialValue() <em>Financial Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinancialValue()
     * @generated
     * @ordered
     */
    protected BigDecimal financialValue = FINANCIAL_VALUE_EDEFAULT;

    /**
     * This is true if the Financial Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean financialValueESet;

    /**
     * The default value of the '{@link #getPlantTransferDateTime() <em>Plant Transfer Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlantTransferDateTime()
     * @generated
     * @ordered
     */
    protected static final Date PLANT_TRANSFER_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlantTransferDateTime() <em>Plant Transfer Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlantTransferDateTime()
     * @generated
     * @ordered
     */
    protected Date plantTransferDateTime = PLANT_TRANSFER_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Plant Transfer Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean plantTransferDateTimeESet;

    /**
     * The default value of the '{@link #getPurchaseDateTime() <em>Purchase Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPurchaseDateTime()
     * @generated
     * @ordered
     */
    protected static final Date PURCHASE_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPurchaseDateTime() <em>Purchase Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPurchaseDateTime()
     * @generated
     * @ordered
     */
    protected Date purchaseDateTime = PURCHASE_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Purchase Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean purchaseDateTimeESet;

    /**
     * The default value of the '{@link #getPurchaseOrderNumber() <em>Purchase Order Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPurchaseOrderNumber()
     * @generated
     * @ordered
     */
    protected static final String PURCHASE_ORDER_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPurchaseOrderNumber() <em>Purchase Order Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPurchaseOrderNumber()
     * @generated
     * @ordered
     */
    protected String purchaseOrderNumber = PURCHASE_ORDER_NUMBER_EDEFAULT;

    /**
     * This is true if the Purchase Order Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean purchaseOrderNumberESet;

    /**
     * The default value of the '{@link #getValueDateTime() <em>Value Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueDateTime()
     * @generated
     * @ordered
     */
    protected static final Date VALUE_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValueDateTime() <em>Value Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueDateTime()
     * @generated
     * @ordered
     */
    protected Date valueDateTime = VALUE_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Value Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valueDateTimeESet;

    /**
     * The default value of the '{@link #getWarrantyEndDateTime() <em>Warranty End Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWarrantyEndDateTime()
     * @generated
     * @ordered
     */
    protected static final Date WARRANTY_END_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWarrantyEndDateTime() <em>Warranty End Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWarrantyEndDateTime()
     * @generated
     * @ordered
     */
    protected Date warrantyEndDateTime = WARRANTY_END_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Warranty End Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean warrantyEndDateTimeESet;

    /**
     * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQuantity()
     * @generated
     * @ordered
     */
    protected IntegerQuantity quantity;

    /**
     * This is true if the Quantity containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean quantityESet;

    /**
     * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsset()
     * @generated
     * @ordered
     */
    protected Asset asset;

    /**
     * This is true if the Asset reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FinancialInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getFinancialInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAccount() {
        return account;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAccount( String newAccount ) {
        String oldAccount = account;
        account = newAccount;
        boolean oldAccountESet = accountESet;
        accountESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FINANCIAL_INFO__ACCOUNT, oldAccount, account, !oldAccountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAccount() {
        String oldAccount = account;
        boolean oldAccountESet = accountESet;
        account = ACCOUNT_EDEFAULT;
        accountESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FINANCIAL_INFO__ACCOUNT, oldAccount, ACCOUNT_EDEFAULT, oldAccountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccount() {
        return accountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getActualPurchaseCost() {
        return actualPurchaseCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setActualPurchaseCost( BigDecimal newActualPurchaseCost ) {
        BigDecimal oldActualPurchaseCost = actualPurchaseCost;
        actualPurchaseCost = newActualPurchaseCost;
        boolean oldActualPurchaseCostESet = actualPurchaseCostESet;
        actualPurchaseCostESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FINANCIAL_INFO__ACTUAL_PURCHASE_COST,
                    oldActualPurchaseCost, actualPurchaseCost, !oldActualPurchaseCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetActualPurchaseCost() {
        BigDecimal oldActualPurchaseCost = actualPurchaseCost;
        boolean oldActualPurchaseCostESet = actualPurchaseCostESet;
        actualPurchaseCost = ACTUAL_PURCHASE_COST_EDEFAULT;
        actualPurchaseCostESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FINANCIAL_INFO__ACTUAL_PURCHASE_COST,
                    oldActualPurchaseCost, ACTUAL_PURCHASE_COST_EDEFAULT, oldActualPurchaseCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetActualPurchaseCost() {
        return actualPurchaseCostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCostDescription() {
        return costDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCostDescription( String newCostDescription ) {
        String oldCostDescription = costDescription;
        costDescription = newCostDescription;
        boolean oldCostDescriptionESet = costDescriptionESet;
        costDescriptionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FINANCIAL_INFO__COST_DESCRIPTION,
                    oldCostDescription, costDescription, !oldCostDescriptionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCostDescription() {
        String oldCostDescription = costDescription;
        boolean oldCostDescriptionESet = costDescriptionESet;
        costDescription = COST_DESCRIPTION_EDEFAULT;
        costDescriptionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FINANCIAL_INFO__COST_DESCRIPTION,
                    oldCostDescription, COST_DESCRIPTION_EDEFAULT, oldCostDescriptionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCostDescription() {
        return costDescriptionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCostType() {
        return costType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCostType( String newCostType ) {
        String oldCostType = costType;
        costType = newCostType;
        boolean oldCostTypeESet = costTypeESet;
        costTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FINANCIAL_INFO__COST_TYPE, oldCostType, costType, !oldCostTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCostType() {
        String oldCostType = costType;
        boolean oldCostTypeESet = costTypeESet;
        costType = COST_TYPE_EDEFAULT;
        costTypeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FINANCIAL_INFO__COST_TYPE, oldCostType, COST_TYPE_EDEFAULT, oldCostTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCostType() {
        return costTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getFinancialValue() {
        return financialValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFinancialValue( BigDecimal newFinancialValue ) {
        BigDecimal oldFinancialValue = financialValue;
        financialValue = newFinancialValue;
        boolean oldFinancialValueESet = financialValueESet;
        financialValueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FINANCIAL_INFO__FINANCIAL_VALUE,
                    oldFinancialValue, financialValue, !oldFinancialValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFinancialValue() {
        BigDecimal oldFinancialValue = financialValue;
        boolean oldFinancialValueESet = financialValueESet;
        financialValue = FINANCIAL_VALUE_EDEFAULT;
        financialValueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FINANCIAL_INFO__FINANCIAL_VALUE,
                    oldFinancialValue, FINANCIAL_VALUE_EDEFAULT, oldFinancialValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFinancialValue() {
        return financialValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getPlantTransferDateTime() {
        return plantTransferDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPlantTransferDateTime( Date newPlantTransferDateTime ) {
        Date oldPlantTransferDateTime = plantTransferDateTime;
        plantTransferDateTime = newPlantTransferDateTime;
        boolean oldPlantTransferDateTimeESet = plantTransferDateTimeESet;
        plantTransferDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FINANCIAL_INFO__PLANT_TRANSFER_DATE_TIME,
                    oldPlantTransferDateTime, plantTransferDateTime, !oldPlantTransferDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPlantTransferDateTime() {
        Date oldPlantTransferDateTime = plantTransferDateTime;
        boolean oldPlantTransferDateTimeESet = plantTransferDateTimeESet;
        plantTransferDateTime = PLANT_TRANSFER_DATE_TIME_EDEFAULT;
        plantTransferDateTimeESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.FINANCIAL_INFO__PLANT_TRANSFER_DATE_TIME,
                        oldPlantTransferDateTime, PLANT_TRANSFER_DATE_TIME_EDEFAULT, oldPlantTransferDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlantTransferDateTime() {
        return plantTransferDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getPurchaseDateTime() {
        return purchaseDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPurchaseDateTime( Date newPurchaseDateTime ) {
        Date oldPurchaseDateTime = purchaseDateTime;
        purchaseDateTime = newPurchaseDateTime;
        boolean oldPurchaseDateTimeESet = purchaseDateTimeESet;
        purchaseDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FINANCIAL_INFO__PURCHASE_DATE_TIME,
                    oldPurchaseDateTime, purchaseDateTime, !oldPurchaseDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPurchaseDateTime() {
        Date oldPurchaseDateTime = purchaseDateTime;
        boolean oldPurchaseDateTimeESet = purchaseDateTimeESet;
        purchaseDateTime = PURCHASE_DATE_TIME_EDEFAULT;
        purchaseDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FINANCIAL_INFO__PURCHASE_DATE_TIME,
                    oldPurchaseDateTime, PURCHASE_DATE_TIME_EDEFAULT, oldPurchaseDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPurchaseDateTime() {
        return purchaseDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPurchaseOrderNumber( String newPurchaseOrderNumber ) {
        String oldPurchaseOrderNumber = purchaseOrderNumber;
        purchaseOrderNumber = newPurchaseOrderNumber;
        boolean oldPurchaseOrderNumberESet = purchaseOrderNumberESet;
        purchaseOrderNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FINANCIAL_INFO__PURCHASE_ORDER_NUMBER,
                    oldPurchaseOrderNumber, purchaseOrderNumber, !oldPurchaseOrderNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPurchaseOrderNumber() {
        String oldPurchaseOrderNumber = purchaseOrderNumber;
        boolean oldPurchaseOrderNumberESet = purchaseOrderNumberESet;
        purchaseOrderNumber = PURCHASE_ORDER_NUMBER_EDEFAULT;
        purchaseOrderNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FINANCIAL_INFO__PURCHASE_ORDER_NUMBER,
                    oldPurchaseOrderNumber, PURCHASE_ORDER_NUMBER_EDEFAULT, oldPurchaseOrderNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPurchaseOrderNumber() {
        return purchaseOrderNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getValueDateTime() {
        return valueDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValueDateTime( Date newValueDateTime ) {
        Date oldValueDateTime = valueDateTime;
        valueDateTime = newValueDateTime;
        boolean oldValueDateTimeESet = valueDateTimeESet;
        valueDateTimeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FINANCIAL_INFO__VALUE_DATE_TIME, oldValueDateTime, valueDateTime, !oldValueDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValueDateTime() {
        Date oldValueDateTime = valueDateTime;
        boolean oldValueDateTimeESet = valueDateTimeESet;
        valueDateTime = VALUE_DATE_TIME_EDEFAULT;
        valueDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FINANCIAL_INFO__VALUE_DATE_TIME,
                    oldValueDateTime, VALUE_DATE_TIME_EDEFAULT, oldValueDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValueDateTime() {
        return valueDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getWarrantyEndDateTime() {
        return warrantyEndDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWarrantyEndDateTime( Date newWarrantyEndDateTime ) {
        Date oldWarrantyEndDateTime = warrantyEndDateTime;
        warrantyEndDateTime = newWarrantyEndDateTime;
        boolean oldWarrantyEndDateTimeESet = warrantyEndDateTimeESet;
        warrantyEndDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FINANCIAL_INFO__WARRANTY_END_DATE_TIME,
                    oldWarrantyEndDateTime, warrantyEndDateTime, !oldWarrantyEndDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWarrantyEndDateTime() {
        Date oldWarrantyEndDateTime = warrantyEndDateTime;
        boolean oldWarrantyEndDateTimeESet = warrantyEndDateTimeESet;
        warrantyEndDateTime = WARRANTY_END_DATE_TIME_EDEFAULT;
        warrantyEndDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FINANCIAL_INFO__WARRANTY_END_DATE_TIME,
                    oldWarrantyEndDateTime, WARRANTY_END_DATE_TIME_EDEFAULT, oldWarrantyEndDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWarrantyEndDateTime() {
        return warrantyEndDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IntegerQuantity getQuantity() {
        return quantity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetQuantity( IntegerQuantity newQuantity, NotificationChain msgs ) {
        IntegerQuantity oldQuantity = quantity;
        quantity = newQuantity;
        boolean oldQuantityESet = quantityESet;
        quantityESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.FINANCIAL_INFO__QUANTITY, oldQuantity, newQuantity, !oldQuantityESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQuantity( IntegerQuantity newQuantity ) {
        if( newQuantity != quantity ) {
            NotificationChain msgs = null;
            if( quantity != null ) msgs = ( ( InternalEObject ) quantity ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.FINANCIAL_INFO__QUANTITY, null, msgs );
            if( newQuantity != null ) msgs = ( ( InternalEObject ) newQuantity ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.FINANCIAL_INFO__QUANTITY, null, msgs );
            msgs = basicSetQuantity( newQuantity, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldQuantityESet = quantityESet;
            quantityESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.FINANCIAL_INFO__QUANTITY, newQuantity, newQuantity, !oldQuantityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetQuantity( NotificationChain msgs ) {
        IntegerQuantity oldQuantity = quantity;
        quantity = null;
        boolean oldQuantityESet = quantityESet;
        quantityESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.FINANCIAL_INFO__QUANTITY, oldQuantity, null, oldQuantityESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQuantity() {
        if( quantity != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) quantity ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.FINANCIAL_INFO__QUANTITY, null, msgs );
            msgs = basicUnsetQuantity( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldQuantityESet = quantityESet;
            quantityESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.FINANCIAL_INFO__QUANTITY, null, null, oldQuantityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQuantity() {
        return quantityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Asset getAsset() {
        if( asset != null && asset.eIsProxy() ) {
            InternalEObject oldAsset = ( InternalEObject ) asset;
            asset = ( Asset ) eResolveProxy( oldAsset );
            if( asset != oldAsset ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.FINANCIAL_INFO__ASSET, oldAsset, asset ) );
            }
        }
        return asset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Asset basicGetAsset() {
        return asset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAsset( Asset newAsset, NotificationChain msgs ) {
        Asset oldAsset = asset;
        asset = newAsset;
        boolean oldAssetESet = assetESet;
        assetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.FINANCIAL_INFO__ASSET, oldAsset, newAsset, !oldAssetESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAsset( Asset newAsset ) {
        if( newAsset != asset ) {
            NotificationChain msgs = null;
            if( asset != null ) msgs = ( ( InternalEObject ) asset ).eInverseRemove( this,
                    CimPackage.ASSET__FINANCIAL_INFO, Asset.class, msgs );
            if( newAsset != null ) msgs = ( ( InternalEObject ) newAsset ).eInverseAdd( this,
                    CimPackage.ASSET__FINANCIAL_INFO, Asset.class, msgs );
            msgs = basicSetAsset( newAsset, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetESet = assetESet;
            assetESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.FINANCIAL_INFO__ASSET, newAsset, newAsset, !oldAssetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAsset( NotificationChain msgs ) {
        Asset oldAsset = asset;
        asset = null;
        boolean oldAssetESet = assetESet;
        assetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.FINANCIAL_INFO__ASSET, oldAsset, null, oldAssetESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAsset() {
        if( asset != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) asset ).eInverseRemove( this, CimPackage.ASSET__FINANCIAL_INFO, Asset.class,
                    msgs );
            msgs = basicUnsetAsset( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetESet = assetESet;
            assetESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.FINANCIAL_INFO__ASSET, null, null, oldAssetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAsset() {
        return assetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.FINANCIAL_INFO__ASSET:
            if( asset != null ) msgs = ( ( InternalEObject ) asset ).eInverseRemove( this,
                    CimPackage.ASSET__FINANCIAL_INFO, Asset.class, msgs );
            return basicSetAsset( ( Asset ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.FINANCIAL_INFO__QUANTITY:
            return basicUnsetQuantity( msgs );
        case CimPackage.FINANCIAL_INFO__ASSET:
            return basicUnsetAsset( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.FINANCIAL_INFO__ACCOUNT:
            return getAccount();
        case CimPackage.FINANCIAL_INFO__ACTUAL_PURCHASE_COST:
            return getActualPurchaseCost();
        case CimPackage.FINANCIAL_INFO__COST_DESCRIPTION:
            return getCostDescription();
        case CimPackage.FINANCIAL_INFO__COST_TYPE:
            return getCostType();
        case CimPackage.FINANCIAL_INFO__FINANCIAL_VALUE:
            return getFinancialValue();
        case CimPackage.FINANCIAL_INFO__PLANT_TRANSFER_DATE_TIME:
            return getPlantTransferDateTime();
        case CimPackage.FINANCIAL_INFO__PURCHASE_DATE_TIME:
            return getPurchaseDateTime();
        case CimPackage.FINANCIAL_INFO__PURCHASE_ORDER_NUMBER:
            return getPurchaseOrderNumber();
        case CimPackage.FINANCIAL_INFO__VALUE_DATE_TIME:
            return getValueDateTime();
        case CimPackage.FINANCIAL_INFO__WARRANTY_END_DATE_TIME:
            return getWarrantyEndDateTime();
        case CimPackage.FINANCIAL_INFO__QUANTITY:
            return getQuantity();
        case CimPackage.FINANCIAL_INFO__ASSET:
            if( resolve ) return getAsset();
            return basicGetAsset();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.FINANCIAL_INFO__ACCOUNT:
            setAccount( ( String ) newValue );
            return;
        case CimPackage.FINANCIAL_INFO__ACTUAL_PURCHASE_COST:
            setActualPurchaseCost( ( BigDecimal ) newValue );
            return;
        case CimPackage.FINANCIAL_INFO__COST_DESCRIPTION:
            setCostDescription( ( String ) newValue );
            return;
        case CimPackage.FINANCIAL_INFO__COST_TYPE:
            setCostType( ( String ) newValue );
            return;
        case CimPackage.FINANCIAL_INFO__FINANCIAL_VALUE:
            setFinancialValue( ( BigDecimal ) newValue );
            return;
        case CimPackage.FINANCIAL_INFO__PLANT_TRANSFER_DATE_TIME:
            setPlantTransferDateTime( ( Date ) newValue );
            return;
        case CimPackage.FINANCIAL_INFO__PURCHASE_DATE_TIME:
            setPurchaseDateTime( ( Date ) newValue );
            return;
        case CimPackage.FINANCIAL_INFO__PURCHASE_ORDER_NUMBER:
            setPurchaseOrderNumber( ( String ) newValue );
            return;
        case CimPackage.FINANCIAL_INFO__VALUE_DATE_TIME:
            setValueDateTime( ( Date ) newValue );
            return;
        case CimPackage.FINANCIAL_INFO__WARRANTY_END_DATE_TIME:
            setWarrantyEndDateTime( ( Date ) newValue );
            return;
        case CimPackage.FINANCIAL_INFO__QUANTITY:
            setQuantity( ( IntegerQuantity ) newValue );
            return;
        case CimPackage.FINANCIAL_INFO__ASSET:
            setAsset( ( Asset ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.FINANCIAL_INFO__ACCOUNT:
            unsetAccount();
            return;
        case CimPackage.FINANCIAL_INFO__ACTUAL_PURCHASE_COST:
            unsetActualPurchaseCost();
            return;
        case CimPackage.FINANCIAL_INFO__COST_DESCRIPTION:
            unsetCostDescription();
            return;
        case CimPackage.FINANCIAL_INFO__COST_TYPE:
            unsetCostType();
            return;
        case CimPackage.FINANCIAL_INFO__FINANCIAL_VALUE:
            unsetFinancialValue();
            return;
        case CimPackage.FINANCIAL_INFO__PLANT_TRANSFER_DATE_TIME:
            unsetPlantTransferDateTime();
            return;
        case CimPackage.FINANCIAL_INFO__PURCHASE_DATE_TIME:
            unsetPurchaseDateTime();
            return;
        case CimPackage.FINANCIAL_INFO__PURCHASE_ORDER_NUMBER:
            unsetPurchaseOrderNumber();
            return;
        case CimPackage.FINANCIAL_INFO__VALUE_DATE_TIME:
            unsetValueDateTime();
            return;
        case CimPackage.FINANCIAL_INFO__WARRANTY_END_DATE_TIME:
            unsetWarrantyEndDateTime();
            return;
        case CimPackage.FINANCIAL_INFO__QUANTITY:
            unsetQuantity();
            return;
        case CimPackage.FINANCIAL_INFO__ASSET:
            unsetAsset();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.FINANCIAL_INFO__ACCOUNT:
            return isSetAccount();
        case CimPackage.FINANCIAL_INFO__ACTUAL_PURCHASE_COST:
            return isSetActualPurchaseCost();
        case CimPackage.FINANCIAL_INFO__COST_DESCRIPTION:
            return isSetCostDescription();
        case CimPackage.FINANCIAL_INFO__COST_TYPE:
            return isSetCostType();
        case CimPackage.FINANCIAL_INFO__FINANCIAL_VALUE:
            return isSetFinancialValue();
        case CimPackage.FINANCIAL_INFO__PLANT_TRANSFER_DATE_TIME:
            return isSetPlantTransferDateTime();
        case CimPackage.FINANCIAL_INFO__PURCHASE_DATE_TIME:
            return isSetPurchaseDateTime();
        case CimPackage.FINANCIAL_INFO__PURCHASE_ORDER_NUMBER:
            return isSetPurchaseOrderNumber();
        case CimPackage.FINANCIAL_INFO__VALUE_DATE_TIME:
            return isSetValueDateTime();
        case CimPackage.FINANCIAL_INFO__WARRANTY_END_DATE_TIME:
            return isSetWarrantyEndDateTime();
        case CimPackage.FINANCIAL_INFO__QUANTITY:
            return isSetQuantity();
        case CimPackage.FINANCIAL_INFO__ASSET:
            return isSetAsset();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (account: " );
        if( accountESet )
            result.append( account );
        else
            result.append( "<unset>" );
        result.append( ", actualPurchaseCost: " );
        if( actualPurchaseCostESet )
            result.append( actualPurchaseCost );
        else
            result.append( "<unset>" );
        result.append( ", costDescription: " );
        if( costDescriptionESet )
            result.append( costDescription );
        else
            result.append( "<unset>" );
        result.append( ", costType: " );
        if( costTypeESet )
            result.append( costType );
        else
            result.append( "<unset>" );
        result.append( ", financialValue: " );
        if( financialValueESet )
            result.append( financialValue );
        else
            result.append( "<unset>" );
        result.append( ", plantTransferDateTime: " );
        if( plantTransferDateTimeESet )
            result.append( plantTransferDateTime );
        else
            result.append( "<unset>" );
        result.append( ", purchaseDateTime: " );
        if( purchaseDateTimeESet )
            result.append( purchaseDateTime );
        else
            result.append( "<unset>" );
        result.append( ", purchaseOrderNumber: " );
        if( purchaseOrderNumberESet )
            result.append( purchaseOrderNumber );
        else
            result.append( "<unset>" );
        result.append( ", valueDateTime: " );
        if( valueDateTimeESet )
            result.append( valueDateTime );
        else
            result.append( "<unset>" );
        result.append( ", warrantyEndDateTime: " );
        if( warrantyEndDateTimeESet )
            result.append( warrantyEndDateTime );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //FinancialInfoImpl
