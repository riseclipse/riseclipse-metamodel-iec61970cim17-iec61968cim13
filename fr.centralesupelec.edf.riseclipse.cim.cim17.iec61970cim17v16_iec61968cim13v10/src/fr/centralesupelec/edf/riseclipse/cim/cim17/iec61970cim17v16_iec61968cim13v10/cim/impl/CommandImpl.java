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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Command;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscreteValue;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ValueAliasSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CommandImpl#getNormalValue <em>Normal Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CommandImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CommandImpl#getDiscreteValue <em>Discrete Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CommandImpl#getValueAliasSet <em>Value Alias Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandImpl extends ControlImpl implements Command {
    /**
     * The default value of the '{@link #getNormalValue() <em>Normal Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalValue()
     * @generated
     * @ordered
     */
    protected static final Integer NORMAL_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNormalValue() <em>Normal Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalValue()
     * @generated
     * @ordered
     */
    protected Integer normalValue = NORMAL_VALUE_EDEFAULT;

    /**
     * This is true if the Normal Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean normalValueESet;

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
     * The cached value of the '{@link #getDiscreteValue() <em>Discrete Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiscreteValue()
     * @generated
     * @ordered
     */
    protected DiscreteValue discreteValue;

    /**
     * This is true if the Discrete Value reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean discreteValueESet;

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
    protected CommandImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCommand();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getNormalValue() {
        return normalValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNormalValue( Integer newNormalValue ) {
        Integer oldNormalValue = normalValue;
        normalValue = newNormalValue;
        boolean oldNormalValueESet = normalValueESet;
        normalValueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.COMMAND__NORMAL_VALUE, oldNormalValue, normalValue, !oldNormalValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNormalValue() {
        Integer oldNormalValue = normalValue;
        boolean oldNormalValueESet = normalValueESet;
        normalValue = NORMAL_VALUE_EDEFAULT;
        normalValueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.COMMAND__NORMAL_VALUE, oldNormalValue, NORMAL_VALUE_EDEFAULT, oldNormalValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNormalValue() {
        return normalValueESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.COMMAND__VALUE,
                oldValue, value, !oldValueESet ) );
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
                CimPackage.COMMAND__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet ) );
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
    public DiscreteValue getDiscreteValue() {
        if( discreteValue != null && discreteValue.eIsProxy() ) {
            InternalEObject oldDiscreteValue = ( InternalEObject ) discreteValue;
            discreteValue = ( DiscreteValue ) eResolveProxy( oldDiscreteValue );
            if( discreteValue != oldDiscreteValue ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.COMMAND__DISCRETE_VALUE, oldDiscreteValue, discreteValue ) );
            }
        }
        return discreteValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiscreteValue basicGetDiscreteValue() {
        return discreteValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiscreteValue( DiscreteValue newDiscreteValue, NotificationChain msgs ) {
        DiscreteValue oldDiscreteValue = discreteValue;
        discreteValue = newDiscreteValue;
        boolean oldDiscreteValueESet = discreteValueESet;
        discreteValueESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.COMMAND__DISCRETE_VALUE, oldDiscreteValue, newDiscreteValue, !oldDiscreteValueESet );
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
    public void setDiscreteValue( DiscreteValue newDiscreteValue ) {
        if( newDiscreteValue != discreteValue ) {
            NotificationChain msgs = null;
            if( discreteValue != null ) msgs = ( ( InternalEObject ) discreteValue ).eInverseRemove( this,
                    CimPackage.DISCRETE_VALUE__COMMAND, DiscreteValue.class, msgs );
            if( newDiscreteValue != null ) msgs = ( ( InternalEObject ) newDiscreteValue ).eInverseAdd( this,
                    CimPackage.DISCRETE_VALUE__COMMAND, DiscreteValue.class, msgs );
            msgs = basicSetDiscreteValue( newDiscreteValue, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiscreteValueESet = discreteValueESet;
            discreteValueESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.COMMAND__DISCRETE_VALUE, newDiscreteValue, newDiscreteValue, !oldDiscreteValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDiscreteValue( NotificationChain msgs ) {
        DiscreteValue oldDiscreteValue = discreteValue;
        discreteValue = null;
        boolean oldDiscreteValueESet = discreteValueESet;
        discreteValueESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.COMMAND__DISCRETE_VALUE, oldDiscreteValue, null, oldDiscreteValueESet );
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
    public void unsetDiscreteValue() {
        if( discreteValue != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) discreteValue ).eInverseRemove( this, CimPackage.DISCRETE_VALUE__COMMAND,
                    DiscreteValue.class, msgs );
            msgs = basicUnsetDiscreteValue( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiscreteValueESet = discreteValueESet;
            discreteValueESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.COMMAND__DISCRETE_VALUE, null, null, oldDiscreteValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiscreteValue() {
        return discreteValueESet;
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
                    CimPackage.COMMAND__VALUE_ALIAS_SET, oldValueAliasSet, newValueAliasSet, !oldValueAliasSetESet );
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
                    CimPackage.VALUE_ALIAS_SET__COMMANDS, ValueAliasSet.class, msgs );
            if( newValueAliasSet != null ) msgs = ( ( InternalEObject ) newValueAliasSet ).eInverseAdd( this,
                    CimPackage.VALUE_ALIAS_SET__COMMANDS, ValueAliasSet.class, msgs );
            msgs = basicSetValueAliasSet( newValueAliasSet, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValueAliasSetESet = valueAliasSetESet;
            valueAliasSetESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.COMMAND__VALUE_ALIAS_SET, newValueAliasSet, newValueAliasSet, !oldValueAliasSetESet ) );
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
                    CimPackage.COMMAND__VALUE_ALIAS_SET, oldValueAliasSet, null, oldValueAliasSetESet );
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
            msgs = ( ( InternalEObject ) valueAliasSet ).eInverseRemove( this, CimPackage.VALUE_ALIAS_SET__COMMANDS,
                    ValueAliasSet.class, msgs );
            msgs = basicUnsetValueAliasSet( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValueAliasSetESet = valueAliasSetESet;
            valueAliasSetESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.COMMAND__VALUE_ALIAS_SET, null, null, oldValueAliasSetESet ) );
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
        case CimPackage.COMMAND__DISCRETE_VALUE:
            if( discreteValue != null ) msgs = ( ( InternalEObject ) discreteValue ).eInverseRemove( this,
                    CimPackage.DISCRETE_VALUE__COMMAND, DiscreteValue.class, msgs );
            return basicSetDiscreteValue( ( DiscreteValue ) otherEnd, msgs );
        case CimPackage.COMMAND__VALUE_ALIAS_SET:
            if( valueAliasSet != null ) msgs = ( ( InternalEObject ) valueAliasSet ).eInverseRemove( this,
                    CimPackage.VALUE_ALIAS_SET__COMMANDS, ValueAliasSet.class, msgs );
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
        case CimPackage.COMMAND__DISCRETE_VALUE:
            return basicUnsetDiscreteValue( msgs );
        case CimPackage.COMMAND__VALUE_ALIAS_SET:
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
        case CimPackage.COMMAND__NORMAL_VALUE:
            return getNormalValue();
        case CimPackage.COMMAND__VALUE:
            return getValue();
        case CimPackage.COMMAND__DISCRETE_VALUE:
            if( resolve ) return getDiscreteValue();
            return basicGetDiscreteValue();
        case CimPackage.COMMAND__VALUE_ALIAS_SET:
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
        case CimPackage.COMMAND__NORMAL_VALUE:
            setNormalValue( ( Integer ) newValue );
            return;
        case CimPackage.COMMAND__VALUE:
            setValue( ( Integer ) newValue );
            return;
        case CimPackage.COMMAND__DISCRETE_VALUE:
            setDiscreteValue( ( DiscreteValue ) newValue );
            return;
        case CimPackage.COMMAND__VALUE_ALIAS_SET:
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
        case CimPackage.COMMAND__NORMAL_VALUE:
            unsetNormalValue();
            return;
        case CimPackage.COMMAND__VALUE:
            unsetValue();
            return;
        case CimPackage.COMMAND__DISCRETE_VALUE:
            unsetDiscreteValue();
            return;
        case CimPackage.COMMAND__VALUE_ALIAS_SET:
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
        case CimPackage.COMMAND__NORMAL_VALUE:
            return isSetNormalValue();
        case CimPackage.COMMAND__VALUE:
            return isSetValue();
        case CimPackage.COMMAND__DISCRETE_VALUE:
            return isSetDiscreteValue();
        case CimPackage.COMMAND__VALUE_ALIAS_SET:
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

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (normalValue: " );
        if( normalValueESet )
            result.append( normalValue );
        else
            result.append( "<unset>" );
        result.append( ", value: " );
        if( valueESet )
            result.append( value );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CommandImpl
