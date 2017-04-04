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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogLimit;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogLimitSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analog Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalogLimitImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalogLimitImpl#getLimitSet <em>Limit Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogLimitImpl extends LimitImpl implements AnalogLimit {
    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final Float VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected Float value = VALUE_EDEFAULT;

    /**
     * This is true if the Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valueESet;

    /**
     * The cached value of the '{@link #getLimitSet() <em>Limit Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLimitSet()
     * @generated
     * @ordered
     */
    protected AnalogLimitSet limitSet;

    /**
     * This is true if the Limit Set reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean limitSetESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnalogLimitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAnalogLimit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue( Float newValue ) {
        Float oldValue = value;
        value = newValue;
        boolean oldValueESet = valueESet;
        valueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ANALOG_LIMIT__VALUE, oldValue, value, !oldValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValue() {
        Float oldValue = value;
        boolean oldValueESet = valueESet;
        value = VALUE_EDEFAULT;
        valueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ANALOG_LIMIT__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValue() {
        return valueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnalogLimitSet getLimitSet() {
        return limitSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLimitSet( AnalogLimitSet newLimitSet, NotificationChain msgs ) {
        AnalogLimitSet oldLimitSet = limitSet;
        limitSet = newLimitSet;
        boolean oldLimitSetESet = limitSetESet;
        limitSetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ANALOG_LIMIT__LIMIT_SET, oldLimitSet, newLimitSet, !oldLimitSetESet );
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
    public void setLimitSet( AnalogLimitSet newLimitSet ) {
        if( newLimitSet != limitSet ) {
            NotificationChain msgs = null;
            if( limitSet != null ) msgs = ( ( InternalEObject ) limitSet ).eInverseRemove( this,
                    CimPackage.ANALOG_LIMIT_SET__LIMITS, AnalogLimitSet.class, msgs );
            if( newLimitSet != null ) msgs = ( ( InternalEObject ) newLimitSet ).eInverseAdd( this,
                    CimPackage.ANALOG_LIMIT_SET__LIMITS, AnalogLimitSet.class, msgs );
            msgs = basicSetLimitSet( newLimitSet, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLimitSetESet = limitSetESet;
            limitSetESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ANALOG_LIMIT__LIMIT_SET, newLimitSet, newLimitSet, !oldLimitSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLimitSet( NotificationChain msgs ) {
        AnalogLimitSet oldLimitSet = limitSet;
        limitSet = null;
        boolean oldLimitSetESet = limitSetESet;
        limitSetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ANALOG_LIMIT__LIMIT_SET, oldLimitSet, null, oldLimitSetESet );
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
    public void unsetLimitSet() {
        if( limitSet != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) limitSet ).eInverseRemove( this, CimPackage.ANALOG_LIMIT_SET__LIMITS,
                    AnalogLimitSet.class, msgs );
            msgs = basicUnsetLimitSet( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLimitSetESet = limitSetESet;
            limitSetESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ANALOG_LIMIT__LIMIT_SET, null, null, oldLimitSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLimitSet() {
        return limitSetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ANALOG_LIMIT__LIMIT_SET:
            if( limitSet != null ) msgs = ( ( InternalEObject ) limitSet ).eInverseRemove( this,
                    CimPackage.ANALOG_LIMIT_SET__LIMITS, AnalogLimitSet.class, msgs );
            return basicSetLimitSet( ( AnalogLimitSet ) otherEnd, msgs );
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
        case CimPackage.ANALOG_LIMIT__LIMIT_SET:
            return basicUnsetLimitSet( msgs );
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
        case CimPackage.ANALOG_LIMIT__VALUE:
            return getValue();
        case CimPackage.ANALOG_LIMIT__LIMIT_SET:
            return getLimitSet();
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
        case CimPackage.ANALOG_LIMIT__VALUE:
            setValue( ( Float ) newValue );
            return;
        case CimPackage.ANALOG_LIMIT__LIMIT_SET:
            setLimitSet( ( AnalogLimitSet ) newValue );
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
        case CimPackage.ANALOG_LIMIT__VALUE:
            unsetValue();
            return;
        case CimPackage.ANALOG_LIMIT__LIMIT_SET:
            unsetLimitSet();
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
        case CimPackage.ANALOG_LIMIT__VALUE:
            return isSetValue();
        case CimPackage.ANALOG_LIMIT__LIMIT_SET:
            return isSetLimitSet();
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
        result.append( " (value: " );
        if( valueESet )
            result.append( value );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AnalogLimitImpl
