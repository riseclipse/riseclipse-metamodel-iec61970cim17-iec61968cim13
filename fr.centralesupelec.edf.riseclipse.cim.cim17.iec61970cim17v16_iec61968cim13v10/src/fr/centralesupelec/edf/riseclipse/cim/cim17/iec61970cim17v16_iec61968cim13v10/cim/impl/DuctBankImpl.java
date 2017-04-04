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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DuctBank;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing;

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
 * An implementation of the model object '<em><b>Duct Bank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DuctBankImpl#getCircuitCount <em>Circuit Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DuctBankImpl#getWireSpacingInfos <em>Wire Spacing Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DuctBankImpl extends AssetContainerImpl implements DuctBank {
    /**
     * The default value of the '{@link #getCircuitCount() <em>Circuit Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCircuitCount()
     * @generated
     * @ordered
     */
    protected static final Integer CIRCUIT_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCircuitCount() <em>Circuit Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCircuitCount()
     * @generated
     * @ordered
     */
    protected Integer circuitCount = CIRCUIT_COUNT_EDEFAULT;

    /**
     * This is true if the Circuit Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean circuitCountESet;

    /**
     * The cached value of the '{@link #getWireSpacingInfos() <em>Wire Spacing Infos</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWireSpacingInfos()
     * @generated
     * @ordered
     */
    protected EList< WireSpacing > wireSpacingInfos;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DuctBankImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDuctBank();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getCircuitCount() {
        return circuitCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCircuitCount( Integer newCircuitCount ) {
        Integer oldCircuitCount = circuitCount;
        circuitCount = newCircuitCount;
        boolean oldCircuitCountESet = circuitCountESet;
        circuitCountESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DUCT_BANK__CIRCUIT_COUNT, oldCircuitCount, circuitCount, !oldCircuitCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCircuitCount() {
        Integer oldCircuitCount = circuitCount;
        boolean oldCircuitCountESet = circuitCountESet;
        circuitCount = CIRCUIT_COUNT_EDEFAULT;
        circuitCountESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DUCT_BANK__CIRCUIT_COUNT, oldCircuitCount, CIRCUIT_COUNT_EDEFAULT, oldCircuitCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCircuitCount() {
        return circuitCountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WireSpacing > getWireSpacingInfos() {
        if( wireSpacingInfos == null ) {
            wireSpacingInfos = new EObjectWithInverseResolvingEList.Unsettable< WireSpacing >( WireSpacing.class, this,
                    CimPackage.DUCT_BANK__WIRE_SPACING_INFOS, CimPackage.WIRE_SPACING__DUCT_BANK );
        }
        return wireSpacingInfos;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWireSpacingInfos() {
        if( wireSpacingInfos != null ) ( ( InternalEList.Unsettable< ? > ) wireSpacingInfos ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWireSpacingInfos() {
        return wireSpacingInfos != null && ( ( InternalEList.Unsettable< ? > ) wireSpacingInfos ).isSet();
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
        case CimPackage.DUCT_BANK__WIRE_SPACING_INFOS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWireSpacingInfos() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.DUCT_BANK__WIRE_SPACING_INFOS:
            return ( ( InternalEList< ? > ) getWireSpacingInfos() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.DUCT_BANK__CIRCUIT_COUNT:
            return getCircuitCount();
        case CimPackage.DUCT_BANK__WIRE_SPACING_INFOS:
            return getWireSpacingInfos();
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
        case CimPackage.DUCT_BANK__CIRCUIT_COUNT:
            setCircuitCount( ( Integer ) newValue );
            return;
        case CimPackage.DUCT_BANK__WIRE_SPACING_INFOS:
            getWireSpacingInfos().clear();
            getWireSpacingInfos().addAll( ( Collection< ? extends WireSpacing > ) newValue );
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
        case CimPackage.DUCT_BANK__CIRCUIT_COUNT:
            unsetCircuitCount();
            return;
        case CimPackage.DUCT_BANK__WIRE_SPACING_INFOS:
            unsetWireSpacingInfos();
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
        case CimPackage.DUCT_BANK__CIRCUIT_COUNT:
            return isSetCircuitCount();
        case CimPackage.DUCT_BANK__WIRE_SPACING_INFOS:
            return isSetWireSpacingInfos();
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
        result.append( " (circuitCount: " );
        if( circuitCountESet )
            result.append( circuitCount );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DuctBankImpl
