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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ValueAliasSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ValueToAlias;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value To Alias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ValueToAliasImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ValueToAliasImpl#getValueAliasSet <em>Value Alias Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueToAliasImpl extends IdentifiedObjectImpl implements ValueToAlias {
    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final Integer VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected Integer value = VALUE_EDEFAULT;

    /**
     * This is true if the Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valueESet;

    /**
     * The cached value of the '{@link #getValueAliasSet() <em>Value Alias Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueAliasSet()
     * @generated
     * @ordered
     */
    protected ValueAliasSet valueAliasSet;

    /**
     * This is true if the Value Alias Set reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valueAliasSetESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ValueToAliasImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getValueToAlias();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue( Integer newValue ) {
        Integer oldValue = value;
        value = newValue;
        boolean oldValueESet = valueESet;
        valueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VALUE_TO_ALIAS__VALUE, oldValue, value, !oldValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValue() {
        Integer oldValue = value;
        boolean oldValueESet = valueESet;
        value = VALUE_EDEFAULT;
        valueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VALUE_TO_ALIAS__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet ) );
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
    public ValueAliasSet getValueAliasSet() {
        return valueAliasSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValueAliasSet( ValueAliasSet newValueAliasSet, NotificationChain msgs ) {
        ValueAliasSet oldValueAliasSet = valueAliasSet;
        valueAliasSet = newValueAliasSet;
        boolean oldValueAliasSetESet = valueAliasSetESet;
        valueAliasSetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET, oldValueAliasSet, newValueAliasSet,
                    !oldValueAliasSetESet );
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
    public void setValueAliasSet( ValueAliasSet newValueAliasSet ) {
        if( newValueAliasSet != valueAliasSet ) {
            NotificationChain msgs = null;
            if( valueAliasSet != null ) msgs = ( ( InternalEObject ) valueAliasSet ).eInverseRemove( this,
                    CimPackage.VALUE_ALIAS_SET__VALUES, ValueAliasSet.class, msgs );
            if( newValueAliasSet != null ) msgs = ( ( InternalEObject ) newValueAliasSet ).eInverseAdd( this,
                    CimPackage.VALUE_ALIAS_SET__VALUES, ValueAliasSet.class, msgs );
            msgs = basicSetValueAliasSet( newValueAliasSet, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValueAliasSetESet = valueAliasSetESet;
            valueAliasSetESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET,
                        newValueAliasSet, newValueAliasSet, !oldValueAliasSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetValueAliasSet( NotificationChain msgs ) {
        ValueAliasSet oldValueAliasSet = valueAliasSet;
        valueAliasSet = null;
        boolean oldValueAliasSetESet = valueAliasSetESet;
        valueAliasSetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET, oldValueAliasSet, null, oldValueAliasSetESet );
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
    public void unsetValueAliasSet() {
        if( valueAliasSet != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) valueAliasSet ).eInverseRemove( this, CimPackage.VALUE_ALIAS_SET__VALUES,
                    ValueAliasSet.class, msgs );
            msgs = basicUnsetValueAliasSet( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValueAliasSetESet = valueAliasSetESet;
            valueAliasSetESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET, null, null, oldValueAliasSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValueAliasSet() {
        return valueAliasSetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET:
            if( valueAliasSet != null ) msgs = ( ( InternalEObject ) valueAliasSet ).eInverseRemove( this,
                    CimPackage.VALUE_ALIAS_SET__VALUES, ValueAliasSet.class, msgs );
            return basicSetValueAliasSet( ( ValueAliasSet ) otherEnd, msgs );
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
        case CimPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET:
            return basicUnsetValueAliasSet( msgs );
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
        case CimPackage.VALUE_TO_ALIAS__VALUE:
            return getValue();
        case CimPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET:
            return getValueAliasSet();
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
        case CimPackage.VALUE_TO_ALIAS__VALUE:
            setValue( ( Integer ) newValue );
            return;
        case CimPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET:
            setValueAliasSet( ( ValueAliasSet ) newValue );
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
        case CimPackage.VALUE_TO_ALIAS__VALUE:
            unsetValue();
            return;
        case CimPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET:
            unsetValueAliasSet();
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
        case CimPackage.VALUE_TO_ALIAS__VALUE:
            return isSetValue();
        case CimPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET:
            return isSetValueAliasSet();
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

} //ValueToAliasImpl
