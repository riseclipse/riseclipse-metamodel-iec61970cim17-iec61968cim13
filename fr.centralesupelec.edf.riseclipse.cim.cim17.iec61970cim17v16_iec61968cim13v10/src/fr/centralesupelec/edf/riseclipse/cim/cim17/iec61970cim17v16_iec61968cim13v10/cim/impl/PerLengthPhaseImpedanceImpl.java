/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthPhaseImpedance;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseImpedanceData;

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
 * An implementation of the model object '<em><b>Per Length Phase Impedance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PerLengthPhaseImpedanceImpl#getConductorCount <em>Conductor Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PerLengthPhaseImpedanceImpl#getPhaseImpedanceData <em>Phase Impedance Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerLengthPhaseImpedanceImpl extends PerLengthImpedanceImpl implements PerLengthPhaseImpedance {
    /**
     * The default value of the '{@link #getConductorCount() <em>Conductor Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConductorCount()
     * @generated
     * @ordered
     */
    protected static final Integer CONDUCTOR_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConductorCount() <em>Conductor Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConductorCount()
     * @generated
     * @ordered
     */
    protected Integer conductorCount = CONDUCTOR_COUNT_EDEFAULT;

    /**
     * This is true if the Conductor Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean conductorCountESet;

    /**
     * The cached value of the '{@link #getPhaseImpedanceData() <em>Phase Impedance Data</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseImpedanceData()
     * @generated
     * @ordered
     */
    protected EList< PhaseImpedanceData > phaseImpedanceData;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PerLengthPhaseImpedanceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPerLengthPhaseImpedance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getConductorCount() {
        return conductorCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConductorCount( Integer newConductorCount ) {
        Integer oldConductorCount = conductorCount;
        conductorCount = newConductorCount;
        boolean oldConductorCountESet = conductorCountESet;
        conductorCountESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT,
                        oldConductorCount, conductorCount, !oldConductorCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConductorCount() {
        Integer oldConductorCount = conductorCount;
        boolean oldConductorCountESet = conductorCountESet;
        conductorCount = CONDUCTOR_COUNT_EDEFAULT;
        conductorCountESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT,
                        oldConductorCount, CONDUCTOR_COUNT_EDEFAULT, oldConductorCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConductorCount() {
        return conductorCountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PhaseImpedanceData > getPhaseImpedanceData() {
        if( phaseImpedanceData == null ) {
            phaseImpedanceData = new EObjectWithInverseResolvingEList.Unsettable< PhaseImpedanceData >(
                    PhaseImpedanceData.class, this, CimPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA,
                    CimPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE );
        }
        return phaseImpedanceData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhaseImpedanceData() {
        if( phaseImpedanceData != null ) ( ( InternalEList.Unsettable< ? > ) phaseImpedanceData ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseImpedanceData() {
        return phaseImpedanceData != null && ( ( InternalEList.Unsettable< ? > ) phaseImpedanceData ).isSet();
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
        case CimPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPhaseImpedanceData() )
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
        case CimPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
            return ( ( InternalEList< ? > ) getPhaseImpedanceData() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT:
            return getConductorCount();
        case CimPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
            return getPhaseImpedanceData();
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
        case CimPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT:
            setConductorCount( ( Integer ) newValue );
            return;
        case CimPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
            getPhaseImpedanceData().clear();
            getPhaseImpedanceData().addAll( ( Collection< ? extends PhaseImpedanceData > ) newValue );
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
        case CimPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT:
            unsetConductorCount();
            return;
        case CimPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
            unsetPhaseImpedanceData();
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
        case CimPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT:
            return isSetConductorCount();
        case CimPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
            return isSetPhaseImpedanceData();
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
        result.append( " (conductorCount: " );
        if( conductorCountESet )
            result.append( conductorCount );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PerLengthPhaseImpedanceImpl
