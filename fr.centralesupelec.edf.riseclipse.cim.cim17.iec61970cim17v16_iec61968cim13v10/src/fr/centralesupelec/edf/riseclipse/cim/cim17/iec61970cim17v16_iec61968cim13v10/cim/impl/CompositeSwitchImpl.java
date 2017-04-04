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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CompositeSwitch;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch;

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
 * An implementation of the model object '<em><b>Composite Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CompositeSwitchImpl#getCompositeSwitchType <em>Composite Switch Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CompositeSwitchImpl#getSwitches <em>Switches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeSwitchImpl extends EquipmentImpl implements CompositeSwitch {
    /**
     * The default value of the '{@link #getCompositeSwitchType() <em>Composite Switch Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCompositeSwitchType()
     * @generated
     * @ordered
     */
    protected static final String COMPOSITE_SWITCH_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCompositeSwitchType() <em>Composite Switch Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCompositeSwitchType()
     * @generated
     * @ordered
     */
    protected String compositeSwitchType = COMPOSITE_SWITCH_TYPE_EDEFAULT;

    /**
     * This is true if the Composite Switch Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean compositeSwitchTypeESet;

    /**
     * The cached value of the '{@link #getSwitches() <em>Switches</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitches()
     * @generated
     * @ordered
     */
    protected EList< Switch > switches;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CompositeSwitchImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCompositeSwitch();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCompositeSwitchType() {
        return compositeSwitchType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCompositeSwitchType( String newCompositeSwitchType ) {
        String oldCompositeSwitchType = compositeSwitchType;
        compositeSwitchType = newCompositeSwitchType;
        boolean oldCompositeSwitchTypeESet = compositeSwitchTypeESet;
        compositeSwitchTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE,
                    oldCompositeSwitchType, compositeSwitchType, !oldCompositeSwitchTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCompositeSwitchType() {
        String oldCompositeSwitchType = compositeSwitchType;
        boolean oldCompositeSwitchTypeESet = compositeSwitchTypeESet;
        compositeSwitchType = COMPOSITE_SWITCH_TYPE_EDEFAULT;
        compositeSwitchTypeESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE,
                        oldCompositeSwitchType, COMPOSITE_SWITCH_TYPE_EDEFAULT, oldCompositeSwitchTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCompositeSwitchType() {
        return compositeSwitchTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Switch > getSwitches() {
        if( switches == null ) {
            switches = new EObjectWithInverseResolvingEList.Unsettable< Switch >( Switch.class, this,
                    CimPackage.COMPOSITE_SWITCH__SWITCHES, CimPackage.SWITCH__COMPOSITE_SWITCH );
        }
        return switches;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSwitches() {
        if( switches != null ) ( ( InternalEList.Unsettable< ? > ) switches ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitches() {
        return switches != null && ( ( InternalEList.Unsettable< ? > ) switches ).isSet();
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
        case CimPackage.COMPOSITE_SWITCH__SWITCHES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSwitches() ).basicAdd( otherEnd,
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
        case CimPackage.COMPOSITE_SWITCH__SWITCHES:
            return ( ( InternalEList< ? > ) getSwitches() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE:
            return getCompositeSwitchType();
        case CimPackage.COMPOSITE_SWITCH__SWITCHES:
            return getSwitches();
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
        case CimPackage.COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE:
            setCompositeSwitchType( ( String ) newValue );
            return;
        case CimPackage.COMPOSITE_SWITCH__SWITCHES:
            getSwitches().clear();
            getSwitches().addAll( ( Collection< ? extends Switch > ) newValue );
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
        case CimPackage.COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE:
            unsetCompositeSwitchType();
            return;
        case CimPackage.COMPOSITE_SWITCH__SWITCHES:
            unsetSwitches();
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
        case CimPackage.COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE:
            return isSetCompositeSwitchType();
        case CimPackage.COMPOSITE_SWITCH__SWITCHES:
            return isSetSwitches();
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
        result.append( " (compositeSwitchType: " );
        if( compositeSwitchTypeESet )
            result.append( compositeSwitchType );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CompositeSwitchImpl
