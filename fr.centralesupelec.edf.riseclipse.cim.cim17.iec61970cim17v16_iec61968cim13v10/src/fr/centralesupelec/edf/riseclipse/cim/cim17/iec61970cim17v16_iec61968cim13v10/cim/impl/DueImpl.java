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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Due;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Due</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DueImpl#getArrears <em>Arrears</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DueImpl#getCharges <em>Charges</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DueImpl#getCurrent <em>Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DueImpl#getInterest <em>Interest</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DueImpl#getPrinciple <em>Principle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DueImpl extends MinimalEObjectImpl.Container implements Due {
    /**
     * The default value of the '{@link #getArrears() <em>Arrears</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArrears()
     * @generated
     * @ordered
     */
    protected static final BigDecimal ARREARS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getArrears() <em>Arrears</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArrears()
     * @generated
     * @ordered
     */
    protected BigDecimal arrears = ARREARS_EDEFAULT;

    /**
     * This is true if the Arrears attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean arrearsESet;

    /**
     * The default value of the '{@link #getCharges() <em>Charges</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharges()
     * @generated
     * @ordered
     */
    protected static final BigDecimal CHARGES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCharges() <em>Charges</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharges()
     * @generated
     * @ordered
     */
    protected BigDecimal charges = CHARGES_EDEFAULT;

    /**
     * This is true if the Charges attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean chargesESet;

    /**
     * The default value of the '{@link #getCurrent() <em>Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrent()
     * @generated
     * @ordered
     */
    protected static final BigDecimal CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCurrent() <em>Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrent()
     * @generated
     * @ordered
     */
    protected BigDecimal current = CURRENT_EDEFAULT;

    /**
     * This is true if the Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean currentESet;

    /**
     * The default value of the '{@link #getInterest() <em>Interest</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterest()
     * @generated
     * @ordered
     */
    protected static final BigDecimal INTEREST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInterest() <em>Interest</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterest()
     * @generated
     * @ordered
     */
    protected BigDecimal interest = INTEREST_EDEFAULT;

    /**
     * This is true if the Interest attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean interestESet;

    /**
     * The default value of the '{@link #getPrinciple() <em>Principle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrinciple()
     * @generated
     * @ordered
     */
    protected static final BigDecimal PRINCIPLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrinciple() <em>Principle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrinciple()
     * @generated
     * @ordered
     */
    protected BigDecimal principle = PRINCIPLE_EDEFAULT;

    /**
     * This is true if the Principle attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean principleESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDue();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getArrears() {
        return arrears;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setArrears( BigDecimal newArrears ) {
        BigDecimal oldArrears = arrears;
        arrears = newArrears;
        boolean oldArrearsESet = arrearsESet;
        arrearsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DUE__ARREARS,
                oldArrears, arrears, !oldArrearsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetArrears() {
        BigDecimal oldArrears = arrears;
        boolean oldArrearsESet = arrearsESet;
        arrears = ARREARS_EDEFAULT;
        arrearsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DUE__ARREARS,
                oldArrears, ARREARS_EDEFAULT, oldArrearsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetArrears() {
        return arrearsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getCharges() {
        return charges;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCharges( BigDecimal newCharges ) {
        BigDecimal oldCharges = charges;
        charges = newCharges;
        boolean oldChargesESet = chargesESet;
        chargesESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DUE__CHARGES,
                oldCharges, charges, !oldChargesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCharges() {
        BigDecimal oldCharges = charges;
        boolean oldChargesESet = chargesESet;
        charges = CHARGES_EDEFAULT;
        chargesESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DUE__CHARGES,
                oldCharges, CHARGES_EDEFAULT, oldChargesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCharges() {
        return chargesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getCurrent() {
        return current;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCurrent( BigDecimal newCurrent ) {
        BigDecimal oldCurrent = current;
        current = newCurrent;
        boolean oldCurrentESet = currentESet;
        currentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DUE__CURRENT,
                oldCurrent, current, !oldCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCurrent() {
        BigDecimal oldCurrent = current;
        boolean oldCurrentESet = currentESet;
        current = CURRENT_EDEFAULT;
        currentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DUE__CURRENT,
                oldCurrent, CURRENT_EDEFAULT, oldCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCurrent() {
        return currentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInterest( BigDecimal newInterest ) {
        BigDecimal oldInterest = interest;
        interest = newInterest;
        boolean oldInterestESet = interestESet;
        interestESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DUE__INTEREST,
                oldInterest, interest, !oldInterestESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInterest() {
        BigDecimal oldInterest = interest;
        boolean oldInterestESet = interestESet;
        interest = INTEREST_EDEFAULT;
        interestESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DUE__INTEREST, oldInterest, INTEREST_EDEFAULT, oldInterestESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInterest() {
        return interestESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getPrinciple() {
        return principle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrinciple( BigDecimal newPrinciple ) {
        BigDecimal oldPrinciple = principle;
        principle = newPrinciple;
        boolean oldPrincipleESet = principleESet;
        principleESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DUE__PRINCIPLE,
                oldPrinciple, principle, !oldPrincipleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrinciple() {
        BigDecimal oldPrinciple = principle;
        boolean oldPrincipleESet = principleESet;
        principle = PRINCIPLE_EDEFAULT;
        principleESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DUE__PRINCIPLE, oldPrinciple, PRINCIPLE_EDEFAULT, oldPrincipleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrinciple() {
        return principleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.DUE__ARREARS:
            return getArrears();
        case CimPackage.DUE__CHARGES:
            return getCharges();
        case CimPackage.DUE__CURRENT:
            return getCurrent();
        case CimPackage.DUE__INTEREST:
            return getInterest();
        case CimPackage.DUE__PRINCIPLE:
            return getPrinciple();
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
        case CimPackage.DUE__ARREARS:
            setArrears( ( BigDecimal ) newValue );
            return;
        case CimPackage.DUE__CHARGES:
            setCharges( ( BigDecimal ) newValue );
            return;
        case CimPackage.DUE__CURRENT:
            setCurrent( ( BigDecimal ) newValue );
            return;
        case CimPackage.DUE__INTEREST:
            setInterest( ( BigDecimal ) newValue );
            return;
        case CimPackage.DUE__PRINCIPLE:
            setPrinciple( ( BigDecimal ) newValue );
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
        case CimPackage.DUE__ARREARS:
            unsetArrears();
            return;
        case CimPackage.DUE__CHARGES:
            unsetCharges();
            return;
        case CimPackage.DUE__CURRENT:
            unsetCurrent();
            return;
        case CimPackage.DUE__INTEREST:
            unsetInterest();
            return;
        case CimPackage.DUE__PRINCIPLE:
            unsetPrinciple();
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
        case CimPackage.DUE__ARREARS:
            return isSetArrears();
        case CimPackage.DUE__CHARGES:
            return isSetCharges();
        case CimPackage.DUE__CURRENT:
            return isSetCurrent();
        case CimPackage.DUE__INTEREST:
            return isSetInterest();
        case CimPackage.DUE__PRINCIPLE:
            return isSetPrinciple();
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
        result.append( " (arrears: " );
        if( arrearsESet )
            result.append( arrears );
        else
            result.append( "<unset>" );
        result.append( ", charges: " );
        if( chargesESet )
            result.append( charges );
        else
            result.append( "<unset>" );
        result.append( ", current: " );
        if( currentESet )
            result.append( current );
        else
            result.append( "<unset>" );
        result.append( ", interest: " );
        if( interestESet )
            result.append( interest );
        else
            result.append( "<unset>" );
        result.append( ", principle: " );
        if( principleESet )
            result.append( principle );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DueImpl
