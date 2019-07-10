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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auxiliary Agreement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAgreementImpl#getArrearsInterest <em>Arrears Interest</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAgreementImpl#getAuxCycle <em>Aux Cycle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAgreementImpl#getAuxPriorityCode <em>Aux Priority Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAgreementImpl#getFixedAmount <em>Fixed Amount</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAgreementImpl#getMinAmount <em>Min Amount</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAgreementImpl#getPayCycle <em>Pay Cycle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAgreementImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAgreementImpl#getVendPortion <em>Vend Portion</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAgreementImpl#getVendPortionArrear <em>Vend Portion Arrear</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAgreementImpl#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuxiliaryAgreementImpl#getCustomerAgreement <em>Customer Agreement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuxiliaryAgreementImpl extends AgreementImpl implements AuxiliaryAgreement {
    /**
     * The default value of the '{@link #getArrearsInterest() <em>Arrears Interest</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArrearsInterest()
     * @generated
     * @ordered
     */
    protected static final Float ARREARS_INTEREST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getArrearsInterest() <em>Arrears Interest</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArrearsInterest()
     * @generated
     * @ordered
     */
    protected Float arrearsInterest = ARREARS_INTEREST_EDEFAULT;

    /**
     * This is true if the Arrears Interest attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean arrearsInterestESet;

    /**
     * The default value of the '{@link #getAuxCycle() <em>Aux Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxCycle()
     * @generated
     * @ordered
     */
    protected static final String AUX_CYCLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAuxCycle() <em>Aux Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxCycle()
     * @generated
     * @ordered
     */
    protected String auxCycle = AUX_CYCLE_EDEFAULT;

    /**
     * This is true if the Aux Cycle attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean auxCycleESet;

    /**
     * The default value of the '{@link #getAuxPriorityCode() <em>Aux Priority Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxPriorityCode()
     * @generated
     * @ordered
     */
    protected static final String AUX_PRIORITY_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAuxPriorityCode() <em>Aux Priority Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxPriorityCode()
     * @generated
     * @ordered
     */
    protected String auxPriorityCode = AUX_PRIORITY_CODE_EDEFAULT;

    /**
     * This is true if the Aux Priority Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean auxPriorityCodeESet;

    /**
     * The default value of the '{@link #getFixedAmount() <em>Fixed Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFixedAmount()
     * @generated
     * @ordered
     */
    protected static final BigDecimal FIXED_AMOUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFixedAmount() <em>Fixed Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFixedAmount()
     * @generated
     * @ordered
     */
    protected BigDecimal fixedAmount = FIXED_AMOUNT_EDEFAULT;

    /**
     * This is true if the Fixed Amount attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fixedAmountESet;

    /**
     * The default value of the '{@link #getMinAmount() <em>Min Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinAmount()
     * @generated
     * @ordered
     */
    protected static final BigDecimal MIN_AMOUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinAmount() <em>Min Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinAmount()
     * @generated
     * @ordered
     */
    protected BigDecimal minAmount = MIN_AMOUNT_EDEFAULT;

    /**
     * This is true if the Min Amount attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minAmountESet;

    /**
     * The default value of the '{@link #getPayCycle() <em>Pay Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPayCycle()
     * @generated
     * @ordered
     */
    protected static final String PAY_CYCLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPayCycle() <em>Pay Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPayCycle()
     * @generated
     * @ordered
     */
    protected String payCycle = PAY_CYCLE_EDEFAULT;

    /**
     * This is true if the Pay Cycle attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean payCycleESet;

    /**
     * The default value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubType()
     * @generated
     * @ordered
     */
    protected static final String SUB_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubType()
     * @generated
     * @ordered
     */
    protected String subType = SUB_TYPE_EDEFAULT;

    /**
     * This is true if the Sub Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean subTypeESet;

    /**
     * The default value of the '{@link #getVendPortion() <em>Vend Portion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVendPortion()
     * @generated
     * @ordered
     */
    protected static final Float VEND_PORTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVendPortion() <em>Vend Portion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVendPortion()
     * @generated
     * @ordered
     */
    protected Float vendPortion = VEND_PORTION_EDEFAULT;

    /**
     * This is true if the Vend Portion attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vendPortionESet;

    /**
     * The default value of the '{@link #getVendPortionArrear() <em>Vend Portion Arrear</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVendPortionArrear()
     * @generated
     * @ordered
     */
    protected static final Float VEND_PORTION_ARREAR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVendPortionArrear() <em>Vend Portion Arrear</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVendPortionArrear()
     * @generated
     * @ordered
     */
    protected Float vendPortionArrear = VEND_PORTION_ARREAR_EDEFAULT;

    /**
     * This is true if the Vend Portion Arrear attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vendPortionArrearESet;

    /**
     * The cached value of the '{@link #getAuxiliaryAccounts() <em>Auxiliary Accounts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxiliaryAccounts()
     * @generated
     * @ordered
     */
    protected EList< AuxiliaryAccount > auxiliaryAccounts;

    /**
     * The cached value of the '{@link #getCustomerAgreement() <em>Customer Agreement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerAgreement()
     * @generated
     * @ordered
     */
    protected CustomerAgreement customerAgreement;

    /**
     * This is true if the Customer Agreement reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean customerAgreementESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AuxiliaryAgreementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAuxiliaryAgreement();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getArrearsInterest() {
        return arrearsInterest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setArrearsInterest( Float newArrearsInterest ) {
        Float oldArrearsInterest = arrearsInterest;
        arrearsInterest = newArrearsInterest;
        boolean oldArrearsInterestESet = arrearsInterestESet;
        arrearsInterestESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.AUXILIARY_AGREEMENT__ARREARS_INTEREST,
                    oldArrearsInterest, arrearsInterest, !oldArrearsInterestESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetArrearsInterest() {
        Float oldArrearsInterest = arrearsInterest;
        boolean oldArrearsInterestESet = arrearsInterestESet;
        arrearsInterest = ARREARS_INTEREST_EDEFAULT;
        arrearsInterestESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.AUXILIARY_AGREEMENT__ARREARS_INTEREST,
                    oldArrearsInterest, ARREARS_INTEREST_EDEFAULT, oldArrearsInterestESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetArrearsInterest() {
        return arrearsInterestESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAuxCycle() {
        return auxCycle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAuxCycle( String newAuxCycle ) {
        String oldAuxCycle = auxCycle;
        auxCycle = newAuxCycle;
        boolean oldAuxCycleESet = auxCycleESet;
        auxCycleESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.AUXILIARY_AGREEMENT__AUX_CYCLE, oldAuxCycle, auxCycle, !oldAuxCycleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAuxCycle() {
        String oldAuxCycle = auxCycle;
        boolean oldAuxCycleESet = auxCycleESet;
        auxCycle = AUX_CYCLE_EDEFAULT;
        auxCycleESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.AUXILIARY_AGREEMENT__AUX_CYCLE, oldAuxCycle, AUX_CYCLE_EDEFAULT, oldAuxCycleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAuxCycle() {
        return auxCycleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAuxPriorityCode() {
        return auxPriorityCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAuxPriorityCode( String newAuxPriorityCode ) {
        String oldAuxPriorityCode = auxPriorityCode;
        auxPriorityCode = newAuxPriorityCode;
        boolean oldAuxPriorityCodeESet = auxPriorityCodeESet;
        auxPriorityCodeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE,
                    oldAuxPriorityCode, auxPriorityCode, !oldAuxPriorityCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAuxPriorityCode() {
        String oldAuxPriorityCode = auxPriorityCode;
        boolean oldAuxPriorityCodeESet = auxPriorityCodeESet;
        auxPriorityCode = AUX_PRIORITY_CODE_EDEFAULT;
        auxPriorityCodeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE,
                    oldAuxPriorityCode, AUX_PRIORITY_CODE_EDEFAULT, oldAuxPriorityCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAuxPriorityCode() {
        return auxPriorityCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getFixedAmount() {
        return fixedAmount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFixedAmount( BigDecimal newFixedAmount ) {
        BigDecimal oldFixedAmount = fixedAmount;
        fixedAmount = newFixedAmount;
        boolean oldFixedAmountESet = fixedAmountESet;
        fixedAmountESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.AUXILIARY_AGREEMENT__FIXED_AMOUNT, oldFixedAmount, fixedAmount, !oldFixedAmountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFixedAmount() {
        BigDecimal oldFixedAmount = fixedAmount;
        boolean oldFixedAmountESet = fixedAmountESet;
        fixedAmount = FIXED_AMOUNT_EDEFAULT;
        fixedAmountESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.AUXILIARY_AGREEMENT__FIXED_AMOUNT,
                    oldFixedAmount, FIXED_AMOUNT_EDEFAULT, oldFixedAmountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFixedAmount() {
        return fixedAmountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getMinAmount() {
        return minAmount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinAmount( BigDecimal newMinAmount ) {
        BigDecimal oldMinAmount = minAmount;
        minAmount = newMinAmount;
        boolean oldMinAmountESet = minAmountESet;
        minAmountESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.AUXILIARY_AGREEMENT__MIN_AMOUNT, oldMinAmount, minAmount, !oldMinAmountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinAmount() {
        BigDecimal oldMinAmount = minAmount;
        boolean oldMinAmountESet = minAmountESet;
        minAmount = MIN_AMOUNT_EDEFAULT;
        minAmountESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.AUXILIARY_AGREEMENT__MIN_AMOUNT, oldMinAmount, MIN_AMOUNT_EDEFAULT, oldMinAmountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinAmount() {
        return minAmountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPayCycle() {
        return payCycle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPayCycle( String newPayCycle ) {
        String oldPayCycle = payCycle;
        payCycle = newPayCycle;
        boolean oldPayCycleESet = payCycleESet;
        payCycleESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.AUXILIARY_AGREEMENT__PAY_CYCLE, oldPayCycle, payCycle, !oldPayCycleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPayCycle() {
        String oldPayCycle = payCycle;
        boolean oldPayCycleESet = payCycleESet;
        payCycle = PAY_CYCLE_EDEFAULT;
        payCycleESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.AUXILIARY_AGREEMENT__PAY_CYCLE, oldPayCycle, PAY_CYCLE_EDEFAULT, oldPayCycleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPayCycle() {
        return payCycleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSubType() {
        return subType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSubType( String newSubType ) {
        String oldSubType = subType;
        subType = newSubType;
        boolean oldSubTypeESet = subTypeESet;
        subTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.AUXILIARY_AGREEMENT__SUB_TYPE, oldSubType, subType, !oldSubTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubType() {
        String oldSubType = subType;
        boolean oldSubTypeESet = subTypeESet;
        subType = SUB_TYPE_EDEFAULT;
        subTypeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.AUXILIARY_AGREEMENT__SUB_TYPE, oldSubType, SUB_TYPE_EDEFAULT, oldSubTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubType() {
        return subTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVendPortion() {
        return vendPortion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVendPortion( Float newVendPortion ) {
        Float oldVendPortion = vendPortion;
        vendPortion = newVendPortion;
        boolean oldVendPortionESet = vendPortionESet;
        vendPortionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.AUXILIARY_AGREEMENT__VEND_PORTION, oldVendPortion, vendPortion, !oldVendPortionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVendPortion() {
        Float oldVendPortion = vendPortion;
        boolean oldVendPortionESet = vendPortionESet;
        vendPortion = VEND_PORTION_EDEFAULT;
        vendPortionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.AUXILIARY_AGREEMENT__VEND_PORTION,
                    oldVendPortion, VEND_PORTION_EDEFAULT, oldVendPortionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVendPortion() {
        return vendPortionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVendPortionArrear() {
        return vendPortionArrear;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVendPortionArrear( Float newVendPortionArrear ) {
        Float oldVendPortionArrear = vendPortionArrear;
        vendPortionArrear = newVendPortionArrear;
        boolean oldVendPortionArrearESet = vendPortionArrearESet;
        vendPortionArrearESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR,
                    oldVendPortionArrear, vendPortionArrear, !oldVendPortionArrearESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVendPortionArrear() {
        Float oldVendPortionArrear = vendPortionArrear;
        boolean oldVendPortionArrearESet = vendPortionArrearESet;
        vendPortionArrear = VEND_PORTION_ARREAR_EDEFAULT;
        vendPortionArrearESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR,
                        oldVendPortionArrear, VEND_PORTION_ARREAR_EDEFAULT, oldVendPortionArrearESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVendPortionArrear() {
        return vendPortionArrearESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AuxiliaryAccount > getAuxiliaryAccounts() {
        if( auxiliaryAccounts == null ) {
            auxiliaryAccounts = new EObjectWithInverseResolvingEList.Unsettable< AuxiliaryAccount >(
                    AuxiliaryAccount.class, this, CimPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS,
                    CimPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT );
        }
        return auxiliaryAccounts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAuxiliaryAccounts() {
        if( auxiliaryAccounts != null ) ( ( InternalEList.Unsettable< ? > ) auxiliaryAccounts ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAuxiliaryAccounts() {
        return auxiliaryAccounts != null && ( ( InternalEList.Unsettable< ? > ) auxiliaryAccounts ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CustomerAgreement getCustomerAgreement() {
        return customerAgreement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCustomerAgreement( CustomerAgreement newCustomerAgreement,
            NotificationChain msgs ) {
        CustomerAgreement oldCustomerAgreement = customerAgreement;
        customerAgreement = newCustomerAgreement;
        boolean oldCustomerAgreementESet = customerAgreementESet;
        customerAgreementESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT, oldCustomerAgreement, newCustomerAgreement,
                    !oldCustomerAgreementESet );
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
    public void setCustomerAgreement( CustomerAgreement newCustomerAgreement ) {
        if( newCustomerAgreement != customerAgreement ) {
            NotificationChain msgs = null;
            if( customerAgreement != null ) msgs = ( ( InternalEObject ) customerAgreement ).eInverseRemove( this,
                    CimPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS, CustomerAgreement.class, msgs );
            if( newCustomerAgreement != null ) msgs = ( ( InternalEObject ) newCustomerAgreement ).eInverseAdd( this,
                    CimPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS, CustomerAgreement.class, msgs );
            msgs = basicSetCustomerAgreement( newCustomerAgreement, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerAgreementESet = customerAgreementESet;
            customerAgreementESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT,
                            newCustomerAgreement, newCustomerAgreement, !oldCustomerAgreementESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCustomerAgreement( NotificationChain msgs ) {
        CustomerAgreement oldCustomerAgreement = customerAgreement;
        customerAgreement = null;
        boolean oldCustomerAgreementESet = customerAgreementESet;
        customerAgreementESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT, oldCustomerAgreement, null,
                    oldCustomerAgreementESet );
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
    public void unsetCustomerAgreement() {
        if( customerAgreement != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) customerAgreement ).eInverseRemove( this,
                    CimPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS, CustomerAgreement.class, msgs );
            msgs = basicUnsetCustomerAgreement( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerAgreementESet = customerAgreementESet;
            customerAgreementESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT, null, null, oldCustomerAgreementESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomerAgreement() {
        return customerAgreementESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAuxiliaryAccounts() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
            if( customerAgreement != null ) msgs = ( ( InternalEObject ) customerAgreement ).eInverseRemove( this,
                    CimPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS, CustomerAgreement.class, msgs );
            return basicSetCustomerAgreement( ( CustomerAgreement ) otherEnd, msgs );
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
        case CimPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
            return ( ( InternalEList< ? > ) getAuxiliaryAccounts() ).basicRemove( otherEnd, msgs );
        case CimPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
            return basicUnsetCustomerAgreement( msgs );
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
        case CimPackage.AUXILIARY_AGREEMENT__ARREARS_INTEREST:
            return getArrearsInterest();
        case CimPackage.AUXILIARY_AGREEMENT__AUX_CYCLE:
            return getAuxCycle();
        case CimPackage.AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE:
            return getAuxPriorityCode();
        case CimPackage.AUXILIARY_AGREEMENT__FIXED_AMOUNT:
            return getFixedAmount();
        case CimPackage.AUXILIARY_AGREEMENT__MIN_AMOUNT:
            return getMinAmount();
        case CimPackage.AUXILIARY_AGREEMENT__PAY_CYCLE:
            return getPayCycle();
        case CimPackage.AUXILIARY_AGREEMENT__SUB_TYPE:
            return getSubType();
        case CimPackage.AUXILIARY_AGREEMENT__VEND_PORTION:
            return getVendPortion();
        case CimPackage.AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR:
            return getVendPortionArrear();
        case CimPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
            return getAuxiliaryAccounts();
        case CimPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
            return getCustomerAgreement();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.AUXILIARY_AGREEMENT__ARREARS_INTEREST:
            setArrearsInterest( ( Float ) newValue );
            return;
        case CimPackage.AUXILIARY_AGREEMENT__AUX_CYCLE:
            setAuxCycle( ( String ) newValue );
            return;
        case CimPackage.AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE:
            setAuxPriorityCode( ( String ) newValue );
            return;
        case CimPackage.AUXILIARY_AGREEMENT__FIXED_AMOUNT:
            setFixedAmount( ( BigDecimal ) newValue );
            return;
        case CimPackage.AUXILIARY_AGREEMENT__MIN_AMOUNT:
            setMinAmount( ( BigDecimal ) newValue );
            return;
        case CimPackage.AUXILIARY_AGREEMENT__PAY_CYCLE:
            setPayCycle( ( String ) newValue );
            return;
        case CimPackage.AUXILIARY_AGREEMENT__SUB_TYPE:
            setSubType( ( String ) newValue );
            return;
        case CimPackage.AUXILIARY_AGREEMENT__VEND_PORTION:
            setVendPortion( ( Float ) newValue );
            return;
        case CimPackage.AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR:
            setVendPortionArrear( ( Float ) newValue );
            return;
        case CimPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
            getAuxiliaryAccounts().clear();
            getAuxiliaryAccounts().addAll( ( Collection< ? extends AuxiliaryAccount > ) newValue );
            return;
        case CimPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
            setCustomerAgreement( ( CustomerAgreement ) newValue );
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
        case CimPackage.AUXILIARY_AGREEMENT__ARREARS_INTEREST:
            unsetArrearsInterest();
            return;
        case CimPackage.AUXILIARY_AGREEMENT__AUX_CYCLE:
            unsetAuxCycle();
            return;
        case CimPackage.AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE:
            unsetAuxPriorityCode();
            return;
        case CimPackage.AUXILIARY_AGREEMENT__FIXED_AMOUNT:
            unsetFixedAmount();
            return;
        case CimPackage.AUXILIARY_AGREEMENT__MIN_AMOUNT:
            unsetMinAmount();
            return;
        case CimPackage.AUXILIARY_AGREEMENT__PAY_CYCLE:
            unsetPayCycle();
            return;
        case CimPackage.AUXILIARY_AGREEMENT__SUB_TYPE:
            unsetSubType();
            return;
        case CimPackage.AUXILIARY_AGREEMENT__VEND_PORTION:
            unsetVendPortion();
            return;
        case CimPackage.AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR:
            unsetVendPortionArrear();
            return;
        case CimPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
            unsetAuxiliaryAccounts();
            return;
        case CimPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
            unsetCustomerAgreement();
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
        case CimPackage.AUXILIARY_AGREEMENT__ARREARS_INTEREST:
            return isSetArrearsInterest();
        case CimPackage.AUXILIARY_AGREEMENT__AUX_CYCLE:
            return isSetAuxCycle();
        case CimPackage.AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE:
            return isSetAuxPriorityCode();
        case CimPackage.AUXILIARY_AGREEMENT__FIXED_AMOUNT:
            return isSetFixedAmount();
        case CimPackage.AUXILIARY_AGREEMENT__MIN_AMOUNT:
            return isSetMinAmount();
        case CimPackage.AUXILIARY_AGREEMENT__PAY_CYCLE:
            return isSetPayCycle();
        case CimPackage.AUXILIARY_AGREEMENT__SUB_TYPE:
            return isSetSubType();
        case CimPackage.AUXILIARY_AGREEMENT__VEND_PORTION:
            return isSetVendPortion();
        case CimPackage.AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR:
            return isSetVendPortionArrear();
        case CimPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
            return isSetAuxiliaryAccounts();
        case CimPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
            return isSetCustomerAgreement();
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

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (arrearsInterest: " );
        if( arrearsInterestESet )
            result.append( arrearsInterest );
        else
            result.append( "<unset>" );
        result.append( ", auxCycle: " );
        if( auxCycleESet )
            result.append( auxCycle );
        else
            result.append( "<unset>" );
        result.append( ", auxPriorityCode: " );
        if( auxPriorityCodeESet )
            result.append( auxPriorityCode );
        else
            result.append( "<unset>" );
        result.append( ", fixedAmount: " );
        if( fixedAmountESet )
            result.append( fixedAmount );
        else
            result.append( "<unset>" );
        result.append( ", minAmount: " );
        if( minAmountESet )
            result.append( minAmount );
        else
            result.append( "<unset>" );
        result.append( ", payCycle: " );
        if( payCycleESet )
            result.append( payCycle );
        else
            result.append( "<unset>" );
        result.append( ", subType: " );
        if( subTypeESet )
            result.append( subType );
        else
            result.append( "<unset>" );
        result.append( ", vendPortion: " );
        if( vendPortionESet )
            result.append( vendPortion );
        else
            result.append( "<unset>" );
        result.append( ", vendPortionArrear: " );
        if( vendPortionArrearESet )
            result.append( vendPortionArrear );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AuxiliaryAgreementImpl
