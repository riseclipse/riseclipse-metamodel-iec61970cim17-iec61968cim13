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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InterrupterUnit;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanism;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interrupter Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.InterrupterUnitImpl#getOperatingMechanism <em>Operating Mechanism</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterrupterUnitImpl extends AssetImpl implements InterrupterUnit {
    /**
     * The cached value of the '{@link #getOperatingMechanism() <em>Operating Mechanism</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperatingMechanism()
     * @generated
     * @ordered
     */
    protected OperatingMechanism operatingMechanism;

    /**
     * This is true if the Operating Mechanism reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean operatingMechanismESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InterrupterUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getInterrupterUnit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperatingMechanism getOperatingMechanism() {
        return operatingMechanism;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOperatingMechanism( OperatingMechanism newOperatingMechanism,
            NotificationChain msgs ) {
        OperatingMechanism oldOperatingMechanism = operatingMechanism;
        operatingMechanism = newOperatingMechanism;
        boolean oldOperatingMechanismESet = operatingMechanismESet;
        operatingMechanismESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.INTERRUPTER_UNIT__OPERATING_MECHANISM, oldOperatingMechanism, newOperatingMechanism,
                    !oldOperatingMechanismESet );
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
    public void setOperatingMechanism( OperatingMechanism newOperatingMechanism ) {
        if( newOperatingMechanism != operatingMechanism ) {
            NotificationChain msgs = null;
            if( operatingMechanism != null ) msgs = ( ( InternalEObject ) operatingMechanism ).eInverseRemove( this,
                    CimPackage.OPERATING_MECHANISM__INTERRUPTER_UNIT, OperatingMechanism.class, msgs );
            if( newOperatingMechanism != null ) msgs = ( ( InternalEObject ) newOperatingMechanism ).eInverseAdd( this,
                    CimPackage.OPERATING_MECHANISM__INTERRUPTER_UNIT, OperatingMechanism.class, msgs );
            msgs = basicSetOperatingMechanism( newOperatingMechanism, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOperatingMechanismESet = operatingMechanismESet;
            operatingMechanismESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.INTERRUPTER_UNIT__OPERATING_MECHANISM,
                            newOperatingMechanism, newOperatingMechanism, !oldOperatingMechanismESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOperatingMechanism( NotificationChain msgs ) {
        OperatingMechanism oldOperatingMechanism = operatingMechanism;
        operatingMechanism = null;
        boolean oldOperatingMechanismESet = operatingMechanismESet;
        operatingMechanismESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INTERRUPTER_UNIT__OPERATING_MECHANISM, oldOperatingMechanism, null,
                    oldOperatingMechanismESet );
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
    public void unsetOperatingMechanism() {
        if( operatingMechanism != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) operatingMechanism ).eInverseRemove( this,
                    CimPackage.OPERATING_MECHANISM__INTERRUPTER_UNIT, OperatingMechanism.class, msgs );
            msgs = basicUnsetOperatingMechanism( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOperatingMechanismESet = operatingMechanismESet;
            operatingMechanismESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INTERRUPTER_UNIT__OPERATING_MECHANISM, null, null, oldOperatingMechanismESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperatingMechanism() {
        return operatingMechanismESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.INTERRUPTER_UNIT__OPERATING_MECHANISM:
            if( operatingMechanism != null ) msgs = ( ( InternalEObject ) operatingMechanism ).eInverseRemove( this,
                    CimPackage.OPERATING_MECHANISM__INTERRUPTER_UNIT, OperatingMechanism.class, msgs );
            return basicSetOperatingMechanism( ( OperatingMechanism ) otherEnd, msgs );
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
        case CimPackage.INTERRUPTER_UNIT__OPERATING_MECHANISM:
            return basicUnsetOperatingMechanism( msgs );
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
        case CimPackage.INTERRUPTER_UNIT__OPERATING_MECHANISM:
            return getOperatingMechanism();
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
        case CimPackage.INTERRUPTER_UNIT__OPERATING_MECHANISM:
            setOperatingMechanism( ( OperatingMechanism ) newValue );
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
        case CimPackage.INTERRUPTER_UNIT__OPERATING_MECHANISM:
            unsetOperatingMechanism();
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
        case CimPackage.INTERRUPTER_UNIT__OPERATING_MECHANISM:
            return isSetOperatingMechanism();
        }
        return super.eIsSet( featureID );
    }

} //InterrupterUnitImpl
