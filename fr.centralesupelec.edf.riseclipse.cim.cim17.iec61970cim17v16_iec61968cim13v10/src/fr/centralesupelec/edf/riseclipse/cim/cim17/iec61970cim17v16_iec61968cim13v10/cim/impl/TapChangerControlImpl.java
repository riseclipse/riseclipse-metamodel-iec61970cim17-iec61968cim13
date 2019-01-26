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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl;

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
 * An implementation of the model object '<em><b>Tap Changer Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerControlImpl#getLimitVoltage <em>Limit Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerControlImpl#getLineDropCompensation <em>Line Drop Compensation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerControlImpl#getLineDropR <em>Line Drop R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerControlImpl#getLineDropX <em>Line Drop X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerControlImpl#getReverseLineDropR <em>Reverse Line Drop R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerControlImpl#getReverseLineDropX <em>Reverse Line Drop X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerControlImpl#getTapChanger <em>Tap Changer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TapChangerControlImpl extends RegulatingControlImpl implements TapChangerControl {
    /**
     * The default value of the '{@link #getLimitVoltage() <em>Limit Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLimitVoltage()
     * @generated
     * @ordered
     */
    protected static final Float LIMIT_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLimitVoltage() <em>Limit Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLimitVoltage()
     * @generated
     * @ordered
     */
    protected Float limitVoltage = LIMIT_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Limit Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean limitVoltageESet;

    /**
     * The default value of the '{@link #getLineDropCompensation() <em>Line Drop Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineDropCompensation()
     * @generated
     * @ordered
     */
    protected static final Boolean LINE_DROP_COMPENSATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLineDropCompensation() <em>Line Drop Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineDropCompensation()
     * @generated
     * @ordered
     */
    protected Boolean lineDropCompensation = LINE_DROP_COMPENSATION_EDEFAULT;

    /**
     * This is true if the Line Drop Compensation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lineDropCompensationESet;

    /**
     * The default value of the '{@link #getLineDropR() <em>Line Drop R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineDropR()
     * @generated
     * @ordered
     */
    protected static final Float LINE_DROP_R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLineDropR() <em>Line Drop R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineDropR()
     * @generated
     * @ordered
     */
    protected Float lineDropR = LINE_DROP_R_EDEFAULT;

    /**
     * This is true if the Line Drop R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lineDropRESet;

    /**
     * The default value of the '{@link #getLineDropX() <em>Line Drop X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineDropX()
     * @generated
     * @ordered
     */
    protected static final Float LINE_DROP_X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLineDropX() <em>Line Drop X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineDropX()
     * @generated
     * @ordered
     */
    protected Float lineDropX = LINE_DROP_X_EDEFAULT;

    /**
     * This is true if the Line Drop X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lineDropXESet;

    /**
     * The default value of the '{@link #getReverseLineDropR() <em>Reverse Line Drop R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReverseLineDropR()
     * @generated
     * @ordered
     */
    protected static final Float REVERSE_LINE_DROP_R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReverseLineDropR() <em>Reverse Line Drop R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReverseLineDropR()
     * @generated
     * @ordered
     */
    protected Float reverseLineDropR = REVERSE_LINE_DROP_R_EDEFAULT;

    /**
     * This is true if the Reverse Line Drop R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reverseLineDropRESet;

    /**
     * The default value of the '{@link #getReverseLineDropX() <em>Reverse Line Drop X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReverseLineDropX()
     * @generated
     * @ordered
     */
    protected static final Float REVERSE_LINE_DROP_X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReverseLineDropX() <em>Reverse Line Drop X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReverseLineDropX()
     * @generated
     * @ordered
     */
    protected Float reverseLineDropX = REVERSE_LINE_DROP_X_EDEFAULT;

    /**
     * This is true if the Reverse Line Drop X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reverseLineDropXESet;

    /**
     * The cached value of the '{@link #getTapChanger() <em>Tap Changer</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTapChanger()
     * @generated
     * @ordered
     */
    protected EList< TapChanger > tapChanger;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TapChangerControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTapChangerControl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLimitVoltage() {
        return limitVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLimitVoltage( Float newLimitVoltage ) {
        Float oldLimitVoltage = limitVoltage;
        limitVoltage = newLimitVoltage;
        boolean oldLimitVoltageESet = limitVoltageESet;
        limitVoltageESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER_CONTROL__LIMIT_VOLTAGE, oldLimitVoltage, limitVoltage, !oldLimitVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLimitVoltage() {
        Float oldLimitVoltage = limitVoltage;
        boolean oldLimitVoltageESet = limitVoltageESet;
        limitVoltage = LIMIT_VOLTAGE_EDEFAULT;
        limitVoltageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER_CONTROL__LIMIT_VOLTAGE,
                    oldLimitVoltage, LIMIT_VOLTAGE_EDEFAULT, oldLimitVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLimitVoltage() {
        return limitVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getLineDropCompensation() {
        return lineDropCompensation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLineDropCompensation( Boolean newLineDropCompensation ) {
        Boolean oldLineDropCompensation = lineDropCompensation;
        lineDropCompensation = newLineDropCompensation;
        boolean oldLineDropCompensationESet = lineDropCompensationESet;
        lineDropCompensationESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_COMPENSATION,
                        oldLineDropCompensation, lineDropCompensation, !oldLineDropCompensationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLineDropCompensation() {
        Boolean oldLineDropCompensation = lineDropCompensation;
        boolean oldLineDropCompensationESet = lineDropCompensationESet;
        lineDropCompensation = LINE_DROP_COMPENSATION_EDEFAULT;
        lineDropCompensationESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_COMPENSATION,
                        oldLineDropCompensation, LINE_DROP_COMPENSATION_EDEFAULT, oldLineDropCompensationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLineDropCompensation() {
        return lineDropCompensationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLineDropR() {
        return lineDropR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLineDropR( Float newLineDropR ) {
        Float oldLineDropR = lineDropR;
        lineDropR = newLineDropR;
        boolean oldLineDropRESet = lineDropRESet;
        lineDropRESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_R, oldLineDropR, lineDropR, !oldLineDropRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLineDropR() {
        Float oldLineDropR = lineDropR;
        boolean oldLineDropRESet = lineDropRESet;
        lineDropR = LINE_DROP_R_EDEFAULT;
        lineDropRESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_R, oldLineDropR, LINE_DROP_R_EDEFAULT, oldLineDropRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLineDropR() {
        return lineDropRESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLineDropX() {
        return lineDropX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLineDropX( Float newLineDropX ) {
        Float oldLineDropX = lineDropX;
        lineDropX = newLineDropX;
        boolean oldLineDropXESet = lineDropXESet;
        lineDropXESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_X, oldLineDropX, lineDropX, !oldLineDropXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLineDropX() {
        Float oldLineDropX = lineDropX;
        boolean oldLineDropXESet = lineDropXESet;
        lineDropX = LINE_DROP_X_EDEFAULT;
        lineDropXESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_X, oldLineDropX, LINE_DROP_X_EDEFAULT, oldLineDropXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLineDropX() {
        return lineDropXESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getReverseLineDropR() {
        return reverseLineDropR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReverseLineDropR( Float newReverseLineDropR ) {
        Float oldReverseLineDropR = reverseLineDropR;
        reverseLineDropR = newReverseLineDropR;
        boolean oldReverseLineDropRESet = reverseLineDropRESet;
        reverseLineDropRESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_R,
                    oldReverseLineDropR, reverseLineDropR, !oldReverseLineDropRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReverseLineDropR() {
        Float oldReverseLineDropR = reverseLineDropR;
        boolean oldReverseLineDropRESet = reverseLineDropRESet;
        reverseLineDropR = REVERSE_LINE_DROP_R_EDEFAULT;
        reverseLineDropRESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_R,
                        oldReverseLineDropR, REVERSE_LINE_DROP_R_EDEFAULT, oldReverseLineDropRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReverseLineDropR() {
        return reverseLineDropRESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getReverseLineDropX() {
        return reverseLineDropX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReverseLineDropX( Float newReverseLineDropX ) {
        Float oldReverseLineDropX = reverseLineDropX;
        reverseLineDropX = newReverseLineDropX;
        boolean oldReverseLineDropXESet = reverseLineDropXESet;
        reverseLineDropXESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_X,
                    oldReverseLineDropX, reverseLineDropX, !oldReverseLineDropXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReverseLineDropX() {
        Float oldReverseLineDropX = reverseLineDropX;
        boolean oldReverseLineDropXESet = reverseLineDropXESet;
        reverseLineDropX = REVERSE_LINE_DROP_X_EDEFAULT;
        reverseLineDropXESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_X,
                        oldReverseLineDropX, REVERSE_LINE_DROP_X_EDEFAULT, oldReverseLineDropXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReverseLineDropX() {
        return reverseLineDropXESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TapChanger > getTapChanger() {
        if( tapChanger == null ) {
            tapChanger = new EObjectWithInverseResolvingEList.Unsettable< TapChanger >( TapChanger.class, this,
                    CimPackage.TAP_CHANGER_CONTROL__TAP_CHANGER, CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL );
        }
        return tapChanger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTapChanger() {
        if( tapChanger != null ) ( ( InternalEList.Unsettable< ? > ) tapChanger ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTapChanger() {
        return tapChanger != null && ( ( InternalEList.Unsettable< ? > ) tapChanger ).isSet();
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
        case CimPackage.TAP_CHANGER_CONTROL__TAP_CHANGER:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTapChanger() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.TAP_CHANGER_CONTROL__TAP_CHANGER:
            return ( ( InternalEList< ? > ) getTapChanger() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.TAP_CHANGER_CONTROL__LIMIT_VOLTAGE:
            return getLimitVoltage();
        case CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_COMPENSATION:
            return getLineDropCompensation();
        case CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_R:
            return getLineDropR();
        case CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_X:
            return getLineDropX();
        case CimPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_R:
            return getReverseLineDropR();
        case CimPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_X:
            return getReverseLineDropX();
        case CimPackage.TAP_CHANGER_CONTROL__TAP_CHANGER:
            return getTapChanger();
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
        case CimPackage.TAP_CHANGER_CONTROL__LIMIT_VOLTAGE:
            setLimitVoltage( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_COMPENSATION:
            setLineDropCompensation( ( Boolean ) newValue );
            return;
        case CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_R:
            setLineDropR( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_X:
            setLineDropX( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_R:
            setReverseLineDropR( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_X:
            setReverseLineDropX( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER_CONTROL__TAP_CHANGER:
            getTapChanger().clear();
            getTapChanger().addAll( ( Collection< ? extends TapChanger > ) newValue );
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
        case CimPackage.TAP_CHANGER_CONTROL__LIMIT_VOLTAGE:
            unsetLimitVoltage();
            return;
        case CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_COMPENSATION:
            unsetLineDropCompensation();
            return;
        case CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_R:
            unsetLineDropR();
            return;
        case CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_X:
            unsetLineDropX();
            return;
        case CimPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_R:
            unsetReverseLineDropR();
            return;
        case CimPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_X:
            unsetReverseLineDropX();
            return;
        case CimPackage.TAP_CHANGER_CONTROL__TAP_CHANGER:
            unsetTapChanger();
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
        case CimPackage.TAP_CHANGER_CONTROL__LIMIT_VOLTAGE:
            return isSetLimitVoltage();
        case CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_COMPENSATION:
            return isSetLineDropCompensation();
        case CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_R:
            return isSetLineDropR();
        case CimPackage.TAP_CHANGER_CONTROL__LINE_DROP_X:
            return isSetLineDropX();
        case CimPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_R:
            return isSetReverseLineDropR();
        case CimPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_X:
            return isSetReverseLineDropX();
        case CimPackage.TAP_CHANGER_CONTROL__TAP_CHANGER:
            return isSetTapChanger();
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
        result.append( " (limitVoltage: " );
        if( limitVoltageESet )
            result.append( limitVoltage );
        else
            result.append( "<unset>" );
        result.append( ", lineDropCompensation: " );
        if( lineDropCompensationESet )
            result.append( lineDropCompensation );
        else
            result.append( "<unset>" );
        result.append( ", lineDropR: " );
        if( lineDropRESet )
            result.append( lineDropR );
        else
            result.append( "<unset>" );
        result.append( ", lineDropX: " );
        if( lineDropXESet )
            result.append( lineDropX );
        else
            result.append( "<unset>" );
        result.append( ", reverseLineDropR: " );
        if( reverseLineDropRESet )
            result.append( reverseLineDropR );
        else
            result.append( "<unset>" );
        result.append( ", reverseLineDropX: " );
        if( reverseLineDropXESet )
            result.append( reverseLineDropX );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TapChangerControlImpl
