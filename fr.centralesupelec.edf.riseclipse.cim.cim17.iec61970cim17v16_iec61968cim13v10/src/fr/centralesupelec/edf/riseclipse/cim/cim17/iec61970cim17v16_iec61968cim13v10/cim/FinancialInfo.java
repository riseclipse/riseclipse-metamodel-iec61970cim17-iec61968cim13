/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import java.math.BigDecimal;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Financial Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getAccount <em>Account</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getActualPurchaseCost <em>Actual Purchase Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getFinancialValue <em>Financial Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getPlantTransferDateTime <em>Plant Transfer Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getPurchaseDateTime <em>Purchase Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getPurchaseOrderNumber <em>Purchase Order Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getWarrantyEndDateTime <em>Warranty End Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFinancialInfo()
 * @model
 * @generated
 */
public interface FinancialInfo extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Account</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Account</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Account</em>' attribute.
     * @see #isSetAccount()
     * @see #unsetAccount()
     * @see #setAccount(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFinancialInfo_Account()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FinancialInfo.account' kind='element'"
     * @generated
     */
    String getAccount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getAccount <em>Account</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Account</em>' attribute.
     * @see #isSetAccount()
     * @see #unsetAccount()
     * @see #getAccount()
     * @generated
     */
    void setAccount( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getAccount <em>Account</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccount()
     * @see #getAccount()
     * @see #setAccount(String)
     * @generated
     */
    void unsetAccount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getAccount <em>Account</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Account</em>' attribute is set.
     * @see #unsetAccount()
     * @see #getAccount()
     * @see #setAccount(String)
     * @generated
     */
    boolean isSetAccount();

    /**
     * Returns the value of the '<em><b>Actual Purchase Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actual Purchase Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actual Purchase Cost</em>' attribute.
     * @see #isSetActualPurchaseCost()
     * @see #unsetActualPurchaseCost()
     * @see #setActualPurchaseCost(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFinancialInfo_ActualPurchaseCost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FinancialInfo.actualPurchaseCost' kind='element'"
     * @generated
     */
    BigDecimal getActualPurchaseCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getActualPurchaseCost <em>Actual Purchase Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Actual Purchase Cost</em>' attribute.
     * @see #isSetActualPurchaseCost()
     * @see #unsetActualPurchaseCost()
     * @see #getActualPurchaseCost()
     * @generated
     */
    void setActualPurchaseCost( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getActualPurchaseCost <em>Actual Purchase Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetActualPurchaseCost()
     * @see #getActualPurchaseCost()
     * @see #setActualPurchaseCost(BigDecimal)
     * @generated
     */
    void unsetActualPurchaseCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getActualPurchaseCost <em>Actual Purchase Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Actual Purchase Cost</em>' attribute is set.
     * @see #unsetActualPurchaseCost()
     * @see #getActualPurchaseCost()
     * @see #setActualPurchaseCost(BigDecimal)
     * @generated
     */
    boolean isSetActualPurchaseCost();

    /**
     * Returns the value of the '<em><b>Cost Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cost Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cost Description</em>' attribute.
     * @see #isSetCostDescription()
     * @see #unsetCostDescription()
     * @see #setCostDescription(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFinancialInfo_CostDescription()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FinancialInfo.costDescription' kind='element'"
     * @generated
     */
    String getCostDescription();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getCostDescription <em>Cost Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cost Description</em>' attribute.
     * @see #isSetCostDescription()
     * @see #unsetCostDescription()
     * @see #getCostDescription()
     * @generated
     */
    void setCostDescription( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getCostDescription <em>Cost Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCostDescription()
     * @see #getCostDescription()
     * @see #setCostDescription(String)
     * @generated
     */
    void unsetCostDescription();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getCostDescription <em>Cost Description</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cost Description</em>' attribute is set.
     * @see #unsetCostDescription()
     * @see #getCostDescription()
     * @see #setCostDescription(String)
     * @generated
     */
    boolean isSetCostDescription();

    /**
     * Returns the value of the '<em><b>Cost Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cost Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cost Type</em>' attribute.
     * @see #isSetCostType()
     * @see #unsetCostType()
     * @see #setCostType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFinancialInfo_CostType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FinancialInfo.costType' kind='element'"
     * @generated
     */
    String getCostType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getCostType <em>Cost Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cost Type</em>' attribute.
     * @see #isSetCostType()
     * @see #unsetCostType()
     * @see #getCostType()
     * @generated
     */
    void setCostType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getCostType <em>Cost Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCostType()
     * @see #getCostType()
     * @see #setCostType(String)
     * @generated
     */
    void unsetCostType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getCostType <em>Cost Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cost Type</em>' attribute is set.
     * @see #unsetCostType()
     * @see #getCostType()
     * @see #setCostType(String)
     * @generated
     */
    boolean isSetCostType();

    /**
     * Returns the value of the '<em><b>Financial Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Financial Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Financial Value</em>' attribute.
     * @see #isSetFinancialValue()
     * @see #unsetFinancialValue()
     * @see #setFinancialValue(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFinancialInfo_FinancialValue()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FinancialInfo.financialValue' kind='element'"
     * @generated
     */
    BigDecimal getFinancialValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getFinancialValue <em>Financial Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Financial Value</em>' attribute.
     * @see #isSetFinancialValue()
     * @see #unsetFinancialValue()
     * @see #getFinancialValue()
     * @generated
     */
    void setFinancialValue( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getFinancialValue <em>Financial Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFinancialValue()
     * @see #getFinancialValue()
     * @see #setFinancialValue(BigDecimal)
     * @generated
     */
    void unsetFinancialValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getFinancialValue <em>Financial Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Financial Value</em>' attribute is set.
     * @see #unsetFinancialValue()
     * @see #getFinancialValue()
     * @see #setFinancialValue(BigDecimal)
     * @generated
     */
    boolean isSetFinancialValue();

    /**
     * Returns the value of the '<em><b>Plant Transfer Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Plant Transfer Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Plant Transfer Date Time</em>' attribute.
     * @see #isSetPlantTransferDateTime()
     * @see #unsetPlantTransferDateTime()
     * @see #setPlantTransferDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFinancialInfo_PlantTransferDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FinancialInfo.plantTransferDateTime' kind='element'"
     * @generated
     */
    Date getPlantTransferDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getPlantTransferDateTime <em>Plant Transfer Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plant Transfer Date Time</em>' attribute.
     * @see #isSetPlantTransferDateTime()
     * @see #unsetPlantTransferDateTime()
     * @see #getPlantTransferDateTime()
     * @generated
     */
    void setPlantTransferDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getPlantTransferDateTime <em>Plant Transfer Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPlantTransferDateTime()
     * @see #getPlantTransferDateTime()
     * @see #setPlantTransferDateTime(Date)
     * @generated
     */
    void unsetPlantTransferDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getPlantTransferDateTime <em>Plant Transfer Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Plant Transfer Date Time</em>' attribute is set.
     * @see #unsetPlantTransferDateTime()
     * @see #getPlantTransferDateTime()
     * @see #setPlantTransferDateTime(Date)
     * @generated
     */
    boolean isSetPlantTransferDateTime();

    /**
     * Returns the value of the '<em><b>Purchase Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Purchase Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Purchase Date Time</em>' attribute.
     * @see #isSetPurchaseDateTime()
     * @see #unsetPurchaseDateTime()
     * @see #setPurchaseDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFinancialInfo_PurchaseDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FinancialInfo.purchaseDateTime' kind='element'"
     * @generated
     */
    Date getPurchaseDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getPurchaseDateTime <em>Purchase Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Purchase Date Time</em>' attribute.
     * @see #isSetPurchaseDateTime()
     * @see #unsetPurchaseDateTime()
     * @see #getPurchaseDateTime()
     * @generated
     */
    void setPurchaseDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getPurchaseDateTime <em>Purchase Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPurchaseDateTime()
     * @see #getPurchaseDateTime()
     * @see #setPurchaseDateTime(Date)
     * @generated
     */
    void unsetPurchaseDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getPurchaseDateTime <em>Purchase Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Purchase Date Time</em>' attribute is set.
     * @see #unsetPurchaseDateTime()
     * @see #getPurchaseDateTime()
     * @see #setPurchaseDateTime(Date)
     * @generated
     */
    boolean isSetPurchaseDateTime();

    /**
     * Returns the value of the '<em><b>Purchase Order Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Purchase Order Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Purchase Order Number</em>' attribute.
     * @see #isSetPurchaseOrderNumber()
     * @see #unsetPurchaseOrderNumber()
     * @see #setPurchaseOrderNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFinancialInfo_PurchaseOrderNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FinancialInfo.purchaseOrderNumber' kind='element'"
     * @generated
     */
    String getPurchaseOrderNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getPurchaseOrderNumber <em>Purchase Order Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Purchase Order Number</em>' attribute.
     * @see #isSetPurchaseOrderNumber()
     * @see #unsetPurchaseOrderNumber()
     * @see #getPurchaseOrderNumber()
     * @generated
     */
    void setPurchaseOrderNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getPurchaseOrderNumber <em>Purchase Order Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPurchaseOrderNumber()
     * @see #getPurchaseOrderNumber()
     * @see #setPurchaseOrderNumber(String)
     * @generated
     */
    void unsetPurchaseOrderNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getPurchaseOrderNumber <em>Purchase Order Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Purchase Order Number</em>' attribute is set.
     * @see #unsetPurchaseOrderNumber()
     * @see #getPurchaseOrderNumber()
     * @see #setPurchaseOrderNumber(String)
     * @generated
     */
    boolean isSetPurchaseOrderNumber();

    /**
     * Returns the value of the '<em><b>Value Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value Date Time</em>' attribute.
     * @see #isSetValueDateTime()
     * @see #unsetValueDateTime()
     * @see #setValueDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFinancialInfo_ValueDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FinancialInfo.valueDateTime' kind='element'"
     * @generated
     */
    Date getValueDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getValueDateTime <em>Value Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value Date Time</em>' attribute.
     * @see #isSetValueDateTime()
     * @see #unsetValueDateTime()
     * @see #getValueDateTime()
     * @generated
     */
    void setValueDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getValueDateTime <em>Value Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValueDateTime()
     * @see #getValueDateTime()
     * @see #setValueDateTime(Date)
     * @generated
     */
    void unsetValueDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getValueDateTime <em>Value Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value Date Time</em>' attribute is set.
     * @see #unsetValueDateTime()
     * @see #getValueDateTime()
     * @see #setValueDateTime(Date)
     * @generated
     */
    boolean isSetValueDateTime();

    /**
     * Returns the value of the '<em><b>Warranty End Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Warranty End Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Warranty End Date Time</em>' attribute.
     * @see #isSetWarrantyEndDateTime()
     * @see #unsetWarrantyEndDateTime()
     * @see #setWarrantyEndDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFinancialInfo_WarrantyEndDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FinancialInfo.warrantyEndDateTime' kind='element'"
     * @generated
     */
    Date getWarrantyEndDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getWarrantyEndDateTime <em>Warranty End Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Warranty End Date Time</em>' attribute.
     * @see #isSetWarrantyEndDateTime()
     * @see #unsetWarrantyEndDateTime()
     * @see #getWarrantyEndDateTime()
     * @generated
     */
    void setWarrantyEndDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getWarrantyEndDateTime <em>Warranty End Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWarrantyEndDateTime()
     * @see #getWarrantyEndDateTime()
     * @see #setWarrantyEndDateTime(Date)
     * @generated
     */
    void unsetWarrantyEndDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getWarrantyEndDateTime <em>Warranty End Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Warranty End Date Time</em>' attribute is set.
     * @see #unsetWarrantyEndDateTime()
     * @see #getWarrantyEndDateTime()
     * @see #setWarrantyEndDateTime(Date)
     * @generated
     */
    boolean isSetWarrantyEndDateTime();

    /**
     * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Quantity</em>' containment reference.
     * @see #isSetQuantity()
     * @see #unsetQuantity()
     * @see #setQuantity(IntegerQuantity)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFinancialInfo_Quantity()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FinancialInfo.quantity' kind='element'"
     * @generated
     */
    IntegerQuantity getQuantity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getQuantity <em>Quantity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Quantity</em>' containment reference.
     * @see #isSetQuantity()
     * @see #unsetQuantity()
     * @see #getQuantity()
     * @generated
     */
    void setQuantity( IntegerQuantity value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getQuantity <em>Quantity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQuantity()
     * @see #getQuantity()
     * @see #setQuantity(IntegerQuantity)
     * @generated
     */
    void unsetQuantity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getQuantity <em>Quantity</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Quantity</em>' containment reference is set.
     * @see #unsetQuantity()
     * @see #getQuantity()
     * @see #setQuantity(IntegerQuantity)
     * @generated
     */
    boolean isSetQuantity();

    /**
     * Returns the value of the '<em><b>Asset</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getFinancialInfo <em>Financial Info</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset</em>' reference.
     * @see #isSetAsset()
     * @see #unsetAsset()
     * @see #setAsset(Asset)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFinancialInfo_Asset()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getFinancialInfo
     * @model opposite="FinancialInfo" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FinancialInfo.Asset' kind='element'"
     * @generated
     */
    Asset getAsset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getAsset <em>Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asset</em>' reference.
     * @see #isSetAsset()
     * @see #unsetAsset()
     * @see #getAsset()
     * @generated
     */
    void setAsset( Asset value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getAsset <em>Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAsset()
     * @see #getAsset()
     * @see #setAsset(Asset)
     * @generated
     */
    void unsetAsset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FinancialInfo#getAsset <em>Asset</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset</em>' reference is set.
     * @see #unsetAsset()
     * @see #getAsset()
     * @see #setAsset(Asset)
     * @generated
     */
    boolean isSetAsset();

} // FinancialInfo
