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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receipt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getIsBankable <em>Is Bankable</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getLine <em>Line</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getTenders <em>Tenders</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getVendorShift <em>Vendor Shift</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getCashierShift <em>Cashier Shift</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReceipt()
 * @model
 * @generated
 */
public interface Receipt extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Is Bankable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Bankable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Bankable</em>' attribute.
     * @see #isSetIsBankable()
     * @see #unsetIsBankable()
     * @see #setIsBankable(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReceipt_IsBankable()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Receipt.isBankable' kind='element'"
     * @generated
     */
    Boolean getIsBankable();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getIsBankable <em>Is Bankable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Bankable</em>' attribute.
     * @see #isSetIsBankable()
     * @see #unsetIsBankable()
     * @see #getIsBankable()
     * @generated
     */
    void setIsBankable( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getIsBankable <em>Is Bankable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsBankable()
     * @see #getIsBankable()
     * @see #setIsBankable(Boolean)
     * @generated
     */
    void unsetIsBankable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getIsBankable <em>Is Bankable</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Bankable</em>' attribute is set.
     * @see #unsetIsBankable()
     * @see #getIsBankable()
     * @see #setIsBankable(Boolean)
     * @generated
     */
    boolean isSetIsBankable();

    /**
     * Returns the value of the '<em><b>Line</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Line</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Line</em>' containment reference.
     * @see #isSetLine()
     * @see #unsetLine()
     * @see #setLine(LineDetail)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReceipt_Line()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Receipt.line' kind='element'"
     * @generated
     */
    LineDetail getLine();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getLine <em>Line</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Line</em>' containment reference.
     * @see #isSetLine()
     * @see #unsetLine()
     * @see #getLine()
     * @generated
     */
    void setLine( LineDetail value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getLine <em>Line</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLine()
     * @see #getLine()
     * @see #setLine(LineDetail)
     * @generated
     */
    void unsetLine();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getLine <em>Line</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Line</em>' containment reference is set.
     * @see #unsetLine()
     * @see #getLine()
     * @see #setLine(LineDetail)
     * @generated
     */
    boolean isSetLine();

    /**
     * Returns the value of the '<em><b>Tenders</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tender}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tender#getReceipt <em>Receipt</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tenders</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tenders</em>' reference list.
     * @see #isSetTenders()
     * @see #unsetTenders()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReceipt_Tenders()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tender#getReceipt
     * @model opposite="Receipt" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Receipt.Tenders' kind='element'"
     * @generated
     */
    EList< Tender > getTenders();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getTenders <em>Tenders</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTenders()
     * @see #getTenders()
     * @generated
     */
    void unsetTenders();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getTenders <em>Tenders</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tenders</em>' reference list is set.
     * @see #unsetTenders()
     * @see #getTenders()
     * @generated
     */
    boolean isSetTenders();

    /**
     * Returns the value of the '<em><b>Transactions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getReceipt <em>Receipt</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transactions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transactions</em>' reference list.
     * @see #isSetTransactions()
     * @see #unsetTransactions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReceipt_Transactions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getReceipt
     * @model opposite="Receipt" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Receipt.Transactions' kind='element'"
     * @generated
     */
    EList< Transaction > getTransactions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getTransactions <em>Transactions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransactions()
     * @see #getTransactions()
     * @generated
     */
    void unsetTransactions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getTransactions <em>Transactions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transactions</em>' reference list is set.
     * @see #unsetTransactions()
     * @see #getTransactions()
     * @generated
     */
    boolean isSetTransactions();

    /**
     * Returns the value of the '<em><b>Vendor Shift</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getReceipts <em>Receipts</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vendor Shift</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vendor Shift</em>' reference.
     * @see #isSetVendorShift()
     * @see #unsetVendorShift()
     * @see #setVendorShift(VendorShift)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReceipt_VendorShift()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getReceipts
     * @model opposite="Receipts" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Receipt.VendorShift' kind='element'"
     * @generated
     */
    VendorShift getVendorShift();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getVendorShift <em>Vendor Shift</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vendor Shift</em>' reference.
     * @see #isSetVendorShift()
     * @see #unsetVendorShift()
     * @see #getVendorShift()
     * @generated
     */
    void setVendorShift( VendorShift value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getVendorShift <em>Vendor Shift</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVendorShift()
     * @see #getVendorShift()
     * @see #setVendorShift(VendorShift)
     * @generated
     */
    void unsetVendorShift();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getVendorShift <em>Vendor Shift</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vendor Shift</em>' reference is set.
     * @see #unsetVendorShift()
     * @see #getVendorShift()
     * @see #setVendorShift(VendorShift)
     * @generated
     */
    boolean isSetVendorShift();

    /**
     * Returns the value of the '<em><b>Cashier Shift</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getReceipts <em>Receipts</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cashier Shift</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cashier Shift</em>' reference.
     * @see #isSetCashierShift()
     * @see #unsetCashierShift()
     * @see #setCashierShift(CashierShift)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReceipt_CashierShift()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getReceipts
     * @model opposite="Receipts" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Receipt.CashierShift' kind='element'"
     * @generated
     */
    CashierShift getCashierShift();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getCashierShift <em>Cashier Shift</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cashier Shift</em>' reference.
     * @see #isSetCashierShift()
     * @see #unsetCashierShift()
     * @see #getCashierShift()
     * @generated
     */
    void setCashierShift( CashierShift value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getCashierShift <em>Cashier Shift</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCashierShift()
     * @see #getCashierShift()
     * @see #setCashierShift(CashierShift)
     * @generated
     */
    void unsetCashierShift();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getCashierShift <em>Cashier Shift</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cashier Shift</em>' reference is set.
     * @see #unsetCashierShift()
     * @see #getCashierShift()
     * @see #setCashierShift(CashierShift)
     * @generated
     */
    boolean isSetCashierShift();

} // Receipt
