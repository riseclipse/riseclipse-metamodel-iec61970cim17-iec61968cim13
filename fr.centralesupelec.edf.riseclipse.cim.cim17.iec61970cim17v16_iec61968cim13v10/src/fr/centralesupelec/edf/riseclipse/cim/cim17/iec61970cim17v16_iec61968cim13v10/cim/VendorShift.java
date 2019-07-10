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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vendor Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getMerchantDebitAmount <em>Merchant Debit Amount</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getPosted <em>Posted</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getReceipts <em>Receipts</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getVendor <em>Vendor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getMerchantAccount <em>Merchant Account</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVendorShift()
 * @model
 * @generated
 */
public interface VendorShift extends Shift {
    /**
     * Returns the value of the '<em><b>Merchant Debit Amount</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Merchant Debit Amount</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Merchant Debit Amount</em>' attribute.
     * @see #isSetMerchantDebitAmount()
     * @see #unsetMerchantDebitAmount()
     * @see #setMerchantDebitAmount(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVendorShift_MerchantDebitAmount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VendorShift.merchantDebitAmount' kind='element'"
     * @generated
     */
    BigDecimal getMerchantDebitAmount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getMerchantDebitAmount <em>Merchant Debit Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Merchant Debit Amount</em>' attribute.
     * @see #isSetMerchantDebitAmount()
     * @see #unsetMerchantDebitAmount()
     * @see #getMerchantDebitAmount()
     * @generated
     */
    void setMerchantDebitAmount( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getMerchantDebitAmount <em>Merchant Debit Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMerchantDebitAmount()
     * @see #getMerchantDebitAmount()
     * @see #setMerchantDebitAmount(BigDecimal)
     * @generated
     */
    void unsetMerchantDebitAmount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getMerchantDebitAmount <em>Merchant Debit Amount</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Merchant Debit Amount</em>' attribute is set.
     * @see #unsetMerchantDebitAmount()
     * @see #getMerchantDebitAmount()
     * @see #setMerchantDebitAmount(BigDecimal)
     * @generated
     */
    boolean isSetMerchantDebitAmount();

    /**
     * Returns the value of the '<em><b>Posted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Posted</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Posted</em>' attribute.
     * @see #isSetPosted()
     * @see #unsetPosted()
     * @see #setPosted(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVendorShift_Posted()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VendorShift.posted' kind='element'"
     * @generated
     */
    Boolean getPosted();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getPosted <em>Posted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Posted</em>' attribute.
     * @see #isSetPosted()
     * @see #unsetPosted()
     * @see #getPosted()
     * @generated
     */
    void setPosted( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getPosted <em>Posted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPosted()
     * @see #getPosted()
     * @see #setPosted(Boolean)
     * @generated
     */
    void unsetPosted();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getPosted <em>Posted</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Posted</em>' attribute is set.
     * @see #unsetPosted()
     * @see #getPosted()
     * @see #setPosted(Boolean)
     * @generated
     */
    boolean isSetPosted();

    /**
     * Returns the value of the '<em><b>Transactions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getVendorShift <em>Vendor Shift</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transactions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transactions</em>' reference list.
     * @see #isSetTransactions()
     * @see #unsetTransactions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVendorShift_Transactions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getVendorShift
     * @model opposite="VendorShift" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VendorShift.Transactions' kind='element'"
     * @generated
     */
    EList< Transaction > getTransactions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getTransactions <em>Transactions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransactions()
     * @see #getTransactions()
     * @generated
     */
    void unsetTransactions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getTransactions <em>Transactions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transactions</em>' reference list is set.
     * @see #unsetTransactions()
     * @see #getTransactions()
     * @generated
     */
    boolean isSetTransactions();

    /**
     * Returns the value of the '<em><b>Receipts</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getVendorShift <em>Vendor Shift</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Receipts</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Receipts</em>' reference list.
     * @see #isSetReceipts()
     * @see #unsetReceipts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVendorShift_Receipts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getVendorShift
     * @model opposite="VendorShift" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VendorShift.Receipts' kind='element'"
     * @generated
     */
    EList< Receipt > getReceipts();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getReceipts <em>Receipts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReceipts()
     * @see #getReceipts()
     * @generated
     */
    void unsetReceipts();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getReceipts <em>Receipts</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Receipts</em>' reference list is set.
     * @see #unsetReceipts()
     * @see #getReceipts()
     * @generated
     */
    boolean isSetReceipts();

    /**
     * Returns the value of the '<em><b>Vendor</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Vendor#getVendorShifts <em>Vendor Shifts</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vendor</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vendor</em>' reference.
     * @see #isSetVendor()
     * @see #unsetVendor()
     * @see #setVendor(Vendor)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVendorShift_Vendor()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Vendor#getVendorShifts
     * @model opposite="VendorShifts" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VendorShift.Vendor' kind='element'"
     * @generated
     */
    Vendor getVendor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getVendor <em>Vendor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vendor</em>' reference.
     * @see #isSetVendor()
     * @see #unsetVendor()
     * @see #getVendor()
     * @generated
     */
    void setVendor( Vendor value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getVendor <em>Vendor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVendor()
     * @see #getVendor()
     * @see #setVendor(Vendor)
     * @generated
     */
    void unsetVendor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getVendor <em>Vendor</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vendor</em>' reference is set.
     * @see #unsetVendor()
     * @see #getVendor()
     * @see #setVendor(Vendor)
     * @generated
     */
    boolean isSetVendor();

    /**
     * Returns the value of the '<em><b>Merchant Account</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getVendorShifts <em>Vendor Shifts</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Merchant Account</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Merchant Account</em>' reference.
     * @see #isSetMerchantAccount()
     * @see #unsetMerchantAccount()
     * @see #setMerchantAccount(MerchantAccount)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVendorShift_MerchantAccount()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getVendorShifts
     * @model opposite="VendorShifts" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VendorShift.MerchantAccount' kind='element'"
     * @generated
     */
    MerchantAccount getMerchantAccount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getMerchantAccount <em>Merchant Account</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Merchant Account</em>' reference.
     * @see #isSetMerchantAccount()
     * @see #unsetMerchantAccount()
     * @see #getMerchantAccount()
     * @generated
     */
    void setMerchantAccount( MerchantAccount value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getMerchantAccount <em>Merchant Account</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMerchantAccount()
     * @see #getMerchantAccount()
     * @see #setMerchantAccount(MerchantAccount)
     * @generated
     */
    void unsetMerchantAccount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getMerchantAccount <em>Merchant Account</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Merchant Account</em>' reference is set.
     * @see #unsetMerchantAccount()
     * @see #getMerchantAccount()
     * @see #setMerchantAccount(MerchantAccount)
     * @generated
     */
    boolean isSetMerchantAccount();

} // VendorShift
