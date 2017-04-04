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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingCondEq;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regulating Cond Eq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RegulatingCondEqImpl#getControlEnabled <em>Control Enabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RegulatingCondEqImpl#getRegulatingControl <em>Regulating Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegulatingCondEqImpl extends EnergyConnectionImpl implements RegulatingCondEq {
    /**
     * The default value of the '{@link #getControlEnabled() <em>Control Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlEnabled()
     * @generated
     * @ordered
     */
    protected static final Boolean CONTROL_ENABLED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlEnabled() <em>Control Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlEnabled()
     * @generated
     * @ordered
     */
    protected Boolean controlEnabled = CONTROL_ENABLED_EDEFAULT;

    /**
     * This is true if the Control Enabled attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlEnabledESet;

    /**
     * The cached value of the '{@link #getRegulatingControl() <em>Regulating Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegulatingControl()
     * @generated
     * @ordered
     */
    protected RegulatingControl regulatingControl;

    /**
     * This is true if the Regulating Control reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean regulatingControlESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RegulatingCondEqImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRegulatingCondEq();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getControlEnabled() {
        return controlEnabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlEnabled( Boolean newControlEnabled ) {
        Boolean oldControlEnabled = controlEnabled;
        controlEnabled = newControlEnabled;
        boolean oldControlEnabledESet = controlEnabledESet;
        controlEnabledESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REGULATING_COND_EQ__CONTROL_ENABLED,
                    oldControlEnabled, controlEnabled, !oldControlEnabledESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlEnabled() {
        Boolean oldControlEnabled = controlEnabled;
        boolean oldControlEnabledESet = controlEnabledESet;
        controlEnabled = CONTROL_ENABLED_EDEFAULT;
        controlEnabledESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REGULATING_COND_EQ__CONTROL_ENABLED,
                    oldControlEnabled, CONTROL_ENABLED_EDEFAULT, oldControlEnabledESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlEnabled() {
        return controlEnabledESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RegulatingControl getRegulatingControl() {
        return regulatingControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRegulatingControl( RegulatingControl newRegulatingControl,
            NotificationChain msgs ) {
        RegulatingControl oldRegulatingControl = regulatingControl;
        regulatingControl = newRegulatingControl;
        boolean oldRegulatingControlESet = regulatingControlESet;
        regulatingControlESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.REGULATING_COND_EQ__REGULATING_CONTROL, oldRegulatingControl, newRegulatingControl,
                    !oldRegulatingControlESet );
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
    public void setRegulatingControl( RegulatingControl newRegulatingControl ) {
        if( newRegulatingControl != regulatingControl ) {
            NotificationChain msgs = null;
            if( regulatingControl != null ) msgs = ( ( InternalEObject ) regulatingControl ).eInverseRemove( this,
                    CimPackage.REGULATING_CONTROL__REGULATING_COND_EQ, RegulatingControl.class, msgs );
            if( newRegulatingControl != null ) msgs = ( ( InternalEObject ) newRegulatingControl ).eInverseAdd( this,
                    CimPackage.REGULATING_CONTROL__REGULATING_COND_EQ, RegulatingControl.class, msgs );
            msgs = basicSetRegulatingControl( newRegulatingControl, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRegulatingControlESet = regulatingControlESet;
            regulatingControlESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.REGULATING_COND_EQ__REGULATING_CONTROL,
                            newRegulatingControl, newRegulatingControl, !oldRegulatingControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRegulatingControl( NotificationChain msgs ) {
        RegulatingControl oldRegulatingControl = regulatingControl;
        regulatingControl = null;
        boolean oldRegulatingControlESet = regulatingControlESet;
        regulatingControlESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REGULATING_COND_EQ__REGULATING_CONTROL, oldRegulatingControl, null,
                    oldRegulatingControlESet );
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
    public void unsetRegulatingControl() {
        if( regulatingControl != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) regulatingControl ).eInverseRemove( this,
                    CimPackage.REGULATING_CONTROL__REGULATING_COND_EQ, RegulatingControl.class, msgs );
            msgs = basicUnsetRegulatingControl( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRegulatingControlESet = regulatingControlESet;
            regulatingControlESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REGULATING_COND_EQ__REGULATING_CONTROL, null, null, oldRegulatingControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRegulatingControl() {
        return regulatingControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
            if( regulatingControl != null ) msgs = ( ( InternalEObject ) regulatingControl ).eInverseRemove( this,
                    CimPackage.REGULATING_CONTROL__REGULATING_COND_EQ, RegulatingControl.class, msgs );
            return basicSetRegulatingControl( ( RegulatingControl ) otherEnd, msgs );
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
        case CimPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
            return basicUnsetRegulatingControl( msgs );
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
        case CimPackage.REGULATING_COND_EQ__CONTROL_ENABLED:
            return getControlEnabled();
        case CimPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
            return getRegulatingControl();
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
        case CimPackage.REGULATING_COND_EQ__CONTROL_ENABLED:
            setControlEnabled( ( Boolean ) newValue );
            return;
        case CimPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
            setRegulatingControl( ( RegulatingControl ) newValue );
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
        case CimPackage.REGULATING_COND_EQ__CONTROL_ENABLED:
            unsetControlEnabled();
            return;
        case CimPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
            unsetRegulatingControl();
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
        case CimPackage.REGULATING_COND_EQ__CONTROL_ENABLED:
            return isSetControlEnabled();
        case CimPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
            return isSetRegulatingControl();
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
        result.append( " (controlEnabled: " );
        if( controlEnabledESet )
            result.append( controlEnabled );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //RegulatingCondEqImpl
