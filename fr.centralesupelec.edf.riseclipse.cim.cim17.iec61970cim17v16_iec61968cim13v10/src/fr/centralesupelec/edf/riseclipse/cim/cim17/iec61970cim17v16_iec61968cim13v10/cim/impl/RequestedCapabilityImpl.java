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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CapabilityKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RequestedCapability;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requested Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RequestedCapabilityImpl#getCapabilityKind <em>Capability Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RequestedCapabilityImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestedCapabilityImpl extends DERCapabilitiesImpl implements RequestedCapability {
    /**
     * The default value of the '{@link #getCapabilityKind() <em>Capability Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityKind()
     * @generated
     * @ordered
     */
    protected static final CapabilityKind CAPABILITY_KIND_EDEFAULT = CapabilityKind.APPARENT_POWER;

    /**
     * The cached value of the '{@link #getCapabilityKind() <em>Capability Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityKind()
     * @generated
     * @ordered
     */
    protected CapabilityKind capabilityKind = CAPABILITY_KIND_EDEFAULT;

    /**
     * This is true if the Capability Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean capabilityKindESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RequestedCapabilityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRequestedCapability();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CapabilityKind getCapabilityKind() {
        return capabilityKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCapabilityKind( CapabilityKind newCapabilityKind ) {
        CapabilityKind oldCapabilityKind = capabilityKind;
        capabilityKind = newCapabilityKind == null ? CAPABILITY_KIND_EDEFAULT : newCapabilityKind;
        boolean oldCapabilityKindESet = capabilityKindESet;
        capabilityKindESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REQUESTED_CAPABILITY__CAPABILITY_KIND,
                    oldCapabilityKind, capabilityKind, !oldCapabilityKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCapabilityKind() {
        CapabilityKind oldCapabilityKind = capabilityKind;
        boolean oldCapabilityKindESet = capabilityKindESet;
        capabilityKind = CAPABILITY_KIND_EDEFAULT;
        capabilityKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REQUESTED_CAPABILITY__CAPABILITY_KIND,
                    oldCapabilityKind, CAPABILITY_KIND_EDEFAULT, oldCapabilityKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapabilityKind() {
        return capabilityKindESet;
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
                CimPackage.REQUESTED_CAPABILITY__VALUE, oldValue, value, !oldValueESet ) );
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
                CimPackage.REQUESTED_CAPABILITY__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet ) );
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.REQUESTED_CAPABILITY__CAPABILITY_KIND:
            return getCapabilityKind();
        case CimPackage.REQUESTED_CAPABILITY__VALUE:
            return getValue();
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
        case CimPackage.REQUESTED_CAPABILITY__CAPABILITY_KIND:
            setCapabilityKind( ( CapabilityKind ) newValue );
            return;
        case CimPackage.REQUESTED_CAPABILITY__VALUE:
            setValue( ( Float ) newValue );
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
        case CimPackage.REQUESTED_CAPABILITY__CAPABILITY_KIND:
            unsetCapabilityKind();
            return;
        case CimPackage.REQUESTED_CAPABILITY__VALUE:
            unsetValue();
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
        case CimPackage.REQUESTED_CAPABILITY__CAPABILITY_KIND:
            return isSetCapabilityKind();
        case CimPackage.REQUESTED_CAPABILITY__VALUE:
            return isSetValue();
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
        result.append( " (capabilityKind: " );
        if( capabilityKindESet )
            result.append( capabilityKind );
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

} //RequestedCapabilityImpl
