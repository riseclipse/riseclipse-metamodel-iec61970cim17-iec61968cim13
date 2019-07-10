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
 * A representation of the model object '<em><b>Auxiliary Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getArrearsInterest <em>Arrears Interest</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getAuxCycle <em>Aux Cycle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getAuxPriorityCode <em>Aux Priority Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getFixedAmount <em>Fixed Amount</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getMinAmount <em>Min Amount</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getPayCycle <em>Pay Cycle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getVendPortion <em>Vend Portion</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getVendPortionArrear <em>Vend Portion Arrear</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getCustomerAgreement <em>Customer Agreement</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAgreement()
 * @model
 * @generated
 */
public interface AuxiliaryAgreement extends Agreement {
    /**
     * Returns the value of the '<em><b>Arrears Interest</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Arrears Interest</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Arrears Interest</em>' attribute.
     * @see #isSetArrearsInterest()
     * @see #unsetArrearsInterest()
     * @see #setArrearsInterest(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAgreement_ArrearsInterest()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAgreement.arrearsInterest' kind='element'"
     * @generated
     */
    Float getArrearsInterest();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getArrearsInterest <em>Arrears Interest</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Arrears Interest</em>' attribute.
     * @see #isSetArrearsInterest()
     * @see #unsetArrearsInterest()
     * @see #getArrearsInterest()
     * @generated
     */
    void setArrearsInterest( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getArrearsInterest <em>Arrears Interest</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetArrearsInterest()
     * @see #getArrearsInterest()
     * @see #setArrearsInterest(Float)
     * @generated
     */
    void unsetArrearsInterest();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getArrearsInterest <em>Arrears Interest</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Arrears Interest</em>' attribute is set.
     * @see #unsetArrearsInterest()
     * @see #getArrearsInterest()
     * @see #setArrearsInterest(Float)
     * @generated
     */
    boolean isSetArrearsInterest();

    /**
     * Returns the value of the '<em><b>Aux Cycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aux Cycle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aux Cycle</em>' attribute.
     * @see #isSetAuxCycle()
     * @see #unsetAuxCycle()
     * @see #setAuxCycle(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAgreement_AuxCycle()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAgreement.auxCycle' kind='element'"
     * @generated
     */
    String getAuxCycle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getAuxCycle <em>Aux Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aux Cycle</em>' attribute.
     * @see #isSetAuxCycle()
     * @see #unsetAuxCycle()
     * @see #getAuxCycle()
     * @generated
     */
    void setAuxCycle( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getAuxCycle <em>Aux Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAuxCycle()
     * @see #getAuxCycle()
     * @see #setAuxCycle(String)
     * @generated
     */
    void unsetAuxCycle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getAuxCycle <em>Aux Cycle</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Aux Cycle</em>' attribute is set.
     * @see #unsetAuxCycle()
     * @see #getAuxCycle()
     * @see #setAuxCycle(String)
     * @generated
     */
    boolean isSetAuxCycle();

    /**
     * Returns the value of the '<em><b>Aux Priority Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aux Priority Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aux Priority Code</em>' attribute.
     * @see #isSetAuxPriorityCode()
     * @see #unsetAuxPriorityCode()
     * @see #setAuxPriorityCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAgreement_AuxPriorityCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAgreement.auxPriorityCode' kind='element'"
     * @generated
     */
    String getAuxPriorityCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getAuxPriorityCode <em>Aux Priority Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aux Priority Code</em>' attribute.
     * @see #isSetAuxPriorityCode()
     * @see #unsetAuxPriorityCode()
     * @see #getAuxPriorityCode()
     * @generated
     */
    void setAuxPriorityCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getAuxPriorityCode <em>Aux Priority Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAuxPriorityCode()
     * @see #getAuxPriorityCode()
     * @see #setAuxPriorityCode(String)
     * @generated
     */
    void unsetAuxPriorityCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getAuxPriorityCode <em>Aux Priority Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Aux Priority Code</em>' attribute is set.
     * @see #unsetAuxPriorityCode()
     * @see #getAuxPriorityCode()
     * @see #setAuxPriorityCode(String)
     * @generated
     */
    boolean isSetAuxPriorityCode();

    /**
     * Returns the value of the '<em><b>Fixed Amount</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fixed Amount</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fixed Amount</em>' attribute.
     * @see #isSetFixedAmount()
     * @see #unsetFixedAmount()
     * @see #setFixedAmount(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAgreement_FixedAmount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAgreement.fixedAmount' kind='element'"
     * @generated
     */
    BigDecimal getFixedAmount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getFixedAmount <em>Fixed Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fixed Amount</em>' attribute.
     * @see #isSetFixedAmount()
     * @see #unsetFixedAmount()
     * @see #getFixedAmount()
     * @generated
     */
    void setFixedAmount( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getFixedAmount <em>Fixed Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFixedAmount()
     * @see #getFixedAmount()
     * @see #setFixedAmount(BigDecimal)
     * @generated
     */
    void unsetFixedAmount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getFixedAmount <em>Fixed Amount</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fixed Amount</em>' attribute is set.
     * @see #unsetFixedAmount()
     * @see #getFixedAmount()
     * @see #setFixedAmount(BigDecimal)
     * @generated
     */
    boolean isSetFixedAmount();

    /**
     * Returns the value of the '<em><b>Min Amount</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Amount</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Amount</em>' attribute.
     * @see #isSetMinAmount()
     * @see #unsetMinAmount()
     * @see #setMinAmount(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAgreement_MinAmount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAgreement.minAmount' kind='element'"
     * @generated
     */
    BigDecimal getMinAmount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getMinAmount <em>Min Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Amount</em>' attribute.
     * @see #isSetMinAmount()
     * @see #unsetMinAmount()
     * @see #getMinAmount()
     * @generated
     */
    void setMinAmount( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getMinAmount <em>Min Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinAmount()
     * @see #getMinAmount()
     * @see #setMinAmount(BigDecimal)
     * @generated
     */
    void unsetMinAmount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getMinAmount <em>Min Amount</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Amount</em>' attribute is set.
     * @see #unsetMinAmount()
     * @see #getMinAmount()
     * @see #setMinAmount(BigDecimal)
     * @generated
     */
    boolean isSetMinAmount();

    /**
     * Returns the value of the '<em><b>Pay Cycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pay Cycle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pay Cycle</em>' attribute.
     * @see #isSetPayCycle()
     * @see #unsetPayCycle()
     * @see #setPayCycle(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAgreement_PayCycle()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAgreement.payCycle' kind='element'"
     * @generated
     */
    String getPayCycle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getPayCycle <em>Pay Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pay Cycle</em>' attribute.
     * @see #isSetPayCycle()
     * @see #unsetPayCycle()
     * @see #getPayCycle()
     * @generated
     */
    void setPayCycle( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getPayCycle <em>Pay Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPayCycle()
     * @see #getPayCycle()
     * @see #setPayCycle(String)
     * @generated
     */
    void unsetPayCycle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getPayCycle <em>Pay Cycle</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pay Cycle</em>' attribute is set.
     * @see #unsetPayCycle()
     * @see #getPayCycle()
     * @see #setPayCycle(String)
     * @generated
     */
    boolean isSetPayCycle();

    /**
     * Returns the value of the '<em><b>Sub Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Type</em>' attribute.
     * @see #isSetSubType()
     * @see #unsetSubType()
     * @see #setSubType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAgreement_SubType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAgreement.subType' kind='element'"
     * @generated
     */
    String getSubType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getSubType <em>Sub Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sub Type</em>' attribute.
     * @see #isSetSubType()
     * @see #unsetSubType()
     * @see #getSubType()
     * @generated
     */
    void setSubType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getSubType <em>Sub Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubType()
     * @see #getSubType()
     * @see #setSubType(String)
     * @generated
     */
    void unsetSubType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getSubType <em>Sub Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sub Type</em>' attribute is set.
     * @see #unsetSubType()
     * @see #getSubType()
     * @see #setSubType(String)
     * @generated
     */
    boolean isSetSubType();

    /**
     * Returns the value of the '<em><b>Vend Portion</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vend Portion</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vend Portion</em>' attribute.
     * @see #isSetVendPortion()
     * @see #unsetVendPortion()
     * @see #setVendPortion(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAgreement_VendPortion()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAgreement.vendPortion' kind='element'"
     * @generated
     */
    Float getVendPortion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getVendPortion <em>Vend Portion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vend Portion</em>' attribute.
     * @see #isSetVendPortion()
     * @see #unsetVendPortion()
     * @see #getVendPortion()
     * @generated
     */
    void setVendPortion( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getVendPortion <em>Vend Portion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVendPortion()
     * @see #getVendPortion()
     * @see #setVendPortion(Float)
     * @generated
     */
    void unsetVendPortion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getVendPortion <em>Vend Portion</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vend Portion</em>' attribute is set.
     * @see #unsetVendPortion()
     * @see #getVendPortion()
     * @see #setVendPortion(Float)
     * @generated
     */
    boolean isSetVendPortion();

    /**
     * Returns the value of the '<em><b>Vend Portion Arrear</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vend Portion Arrear</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vend Portion Arrear</em>' attribute.
     * @see #isSetVendPortionArrear()
     * @see #unsetVendPortionArrear()
     * @see #setVendPortionArrear(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAgreement_VendPortionArrear()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAgreement.vendPortionArrear' kind='element'"
     * @generated
     */
    Float getVendPortionArrear();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getVendPortionArrear <em>Vend Portion Arrear</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vend Portion Arrear</em>' attribute.
     * @see #isSetVendPortionArrear()
     * @see #unsetVendPortionArrear()
     * @see #getVendPortionArrear()
     * @generated
     */
    void setVendPortionArrear( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getVendPortionArrear <em>Vend Portion Arrear</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVendPortionArrear()
     * @see #getVendPortionArrear()
     * @see #setVendPortionArrear(Float)
     * @generated
     */
    void unsetVendPortionArrear();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getVendPortionArrear <em>Vend Portion Arrear</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vend Portion Arrear</em>' attribute is set.
     * @see #unsetVendPortionArrear()
     * @see #getVendPortionArrear()
     * @see #setVendPortionArrear(Float)
     * @generated
     */
    boolean isSetVendPortionArrear();

    /**
     * Returns the value of the '<em><b>Auxiliary Accounts</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getAuxiliaryAgreement <em>Auxiliary Agreement</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Auxiliary Accounts</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Auxiliary Accounts</em>' reference list.
     * @see #isSetAuxiliaryAccounts()
     * @see #unsetAuxiliaryAccounts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAgreement_AuxiliaryAccounts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getAuxiliaryAgreement
     * @model opposite="AuxiliaryAgreement" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAgreement.AuxiliaryAccounts' kind='element'"
     * @generated
     */
    EList< AuxiliaryAccount > getAuxiliaryAccounts();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAuxiliaryAccounts()
     * @see #getAuxiliaryAccounts()
     * @generated
     */
    void unsetAuxiliaryAccounts();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Auxiliary Accounts</em>' reference list is set.
     * @see #unsetAuxiliaryAccounts()
     * @see #getAuxiliaryAccounts()
     * @generated
     */
    boolean isSetAuxiliaryAccounts();

    /**
     * Returns the value of the '<em><b>Customer Agreement</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement#getAuxiliaryAgreements <em>Auxiliary Agreements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer Agreement</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customer Agreement</em>' reference.
     * @see #isSetCustomerAgreement()
     * @see #unsetCustomerAgreement()
     * @see #setCustomerAgreement(CustomerAgreement)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAgreement_CustomerAgreement()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement#getAuxiliaryAgreements
     * @model opposite="AuxiliaryAgreements" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAgreement.CustomerAgreement' kind='element'"
     * @generated
     */
    CustomerAgreement getCustomerAgreement();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getCustomerAgreement <em>Customer Agreement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Customer Agreement</em>' reference.
     * @see #isSetCustomerAgreement()
     * @see #unsetCustomerAgreement()
     * @see #getCustomerAgreement()
     * @generated
     */
    void setCustomerAgreement( CustomerAgreement value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getCustomerAgreement <em>Customer Agreement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomerAgreement()
     * @see #getCustomerAgreement()
     * @see #setCustomerAgreement(CustomerAgreement)
     * @generated
     */
    void unsetCustomerAgreement();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getCustomerAgreement <em>Customer Agreement</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Customer Agreement</em>' reference is set.
     * @see #unsetCustomerAgreement()
     * @see #getCustomerAgreement()
     * @see #setCustomerAgreement(CustomerAgreement)
     * @generated
     */
    boolean isSetCustomerAgreement();

} // AuxiliaryAgreement
