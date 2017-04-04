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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cashier Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getCashFloat <em>Cash Float</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getCashier <em>Cashier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getPointOfSale <em>Point Of Sale</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getReceipts <em>Receipts</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCashierShift()
 * @model
 * @generated
 */
public interface CashierShift extends Shift {
    /**
     * Returns the value of the '<em><b>Cash Float</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cash Float</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cash Float</em>' attribute.
     * @see #isSetCashFloat()
     * @see #unsetCashFloat()
     * @see #setCashFloat(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCashierShift_CashFloat()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CashierShift.cashFloat' kind='element'"
     * @generated
     */
    BigDecimal getCashFloat();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getCashFloat <em>Cash Float</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cash Float</em>' attribute.
     * @see #isSetCashFloat()
     * @see #unsetCashFloat()
     * @see #getCashFloat()
     * @generated
     */
    void setCashFloat( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getCashFloat <em>Cash Float</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCashFloat()
     * @see #getCashFloat()
     * @see #setCashFloat(BigDecimal)
     * @generated
     */
    void unsetCashFloat();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getCashFloat <em>Cash Float</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cash Float</em>' attribute is set.
     * @see #unsetCashFloat()
     * @see #getCashFloat()
     * @see #setCashFloat(BigDecimal)
     * @generated
     */
    boolean isSetCashFloat();

    /**
     * Returns the value of the '<em><b>Transactions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getCashierShift <em>Cashier Shift</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transactions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transactions</em>' reference list.
     * @see #isSetTransactions()
     * @see #unsetTransactions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCashierShift_Transactions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getCashierShift
     * @model opposite="CashierShift" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CashierShift.Transactions' kind='element'"
     * @generated
     */
    EList< Transaction > getTransactions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getTransactions <em>Transactions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransactions()
     * @see #getTransactions()
     * @generated
     */
    void unsetTransactions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getTransactions <em>Transactions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transactions</em>' reference list is set.
     * @see #unsetTransactions()
     * @see #getTransactions()
     * @generated
     */
    boolean isSetTransactions();

    /**
     * Returns the value of the '<em><b>Cashier</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Cashier#getCashierShifts <em>Cashier Shifts</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cashier</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cashier</em>' reference.
     * @see #isSetCashier()
     * @see #unsetCashier()
     * @see #setCashier(Cashier)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCashierShift_Cashier()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Cashier#getCashierShifts
     * @model opposite="CashierShifts" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CashierShift.Cashier' kind='element'"
     * @generated
     */
    Cashier getCashier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getCashier <em>Cashier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cashier</em>' reference.
     * @see #isSetCashier()
     * @see #unsetCashier()
     * @see #getCashier()
     * @generated
     */
    void setCashier( Cashier value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getCashier <em>Cashier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCashier()
     * @see #getCashier()
     * @see #setCashier(Cashier)
     * @generated
     */
    void unsetCashier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getCashier <em>Cashier</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cashier</em>' reference is set.
     * @see #unsetCashier()
     * @see #getCashier()
     * @see #setCashier(Cashier)
     * @generated
     */
    boolean isSetCashier();

    /**
     * Returns the value of the '<em><b>Point Of Sale</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PointOfSale#getCashierShifts <em>Cashier Shifts</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Point Of Sale</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Point Of Sale</em>' reference.
     * @see #isSetPointOfSale()
     * @see #unsetPointOfSale()
     * @see #setPointOfSale(PointOfSale)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCashierShift_PointOfSale()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PointOfSale#getCashierShifts
     * @model opposite="CashierShifts" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CashierShift.PointOfSale' kind='element'"
     * @generated
     */
    PointOfSale getPointOfSale();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getPointOfSale <em>Point Of Sale</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Point Of Sale</em>' reference.
     * @see #isSetPointOfSale()
     * @see #unsetPointOfSale()
     * @see #getPointOfSale()
     * @generated
     */
    void setPointOfSale( PointOfSale value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getPointOfSale <em>Point Of Sale</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPointOfSale()
     * @see #getPointOfSale()
     * @see #setPointOfSale(PointOfSale)
     * @generated
     */
    void unsetPointOfSale();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getPointOfSale <em>Point Of Sale</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Point Of Sale</em>' reference is set.
     * @see #unsetPointOfSale()
     * @see #getPointOfSale()
     * @see #setPointOfSale(PointOfSale)
     * @generated
     */
    boolean isSetPointOfSale();

    /**
     * Returns the value of the '<em><b>Receipts</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getCashierShift <em>Cashier Shift</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Receipts</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Receipts</em>' reference list.
     * @see #isSetReceipts()
     * @see #unsetReceipts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCashierShift_Receipts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt#getCashierShift
     * @model opposite="CashierShift" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CashierShift.Receipts' kind='element'"
     * @generated
     */
    EList< Receipt > getReceipts();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getReceipts <em>Receipts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReceipts()
     * @see #getReceipts()
     * @generated
     */
    void unsetReceipts();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift#getReceipts <em>Receipts</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Receipts</em>' reference list is set.
     * @see #unsetReceipts()
     * @see #getReceipts()
     * @generated
     */
    boolean isSetReceipts();

} // CashierShift
