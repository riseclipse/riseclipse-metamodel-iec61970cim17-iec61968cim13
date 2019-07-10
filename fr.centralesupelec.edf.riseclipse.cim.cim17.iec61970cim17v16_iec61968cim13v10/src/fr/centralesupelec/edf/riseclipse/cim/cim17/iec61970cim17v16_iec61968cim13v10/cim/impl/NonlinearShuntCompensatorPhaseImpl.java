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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhase;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nonlinear Shunt Compensator Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NonlinearShuntCompensatorPhaseImpl#getNonlinearShuntCompensatorPhasePoints <em>Nonlinear Shunt Compensator Phase Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonlinearShuntCompensatorPhaseImpl extends ShuntCompensatorPhaseImpl
        implements NonlinearShuntCompensatorPhase {
    /**
     * The cached value of the '{@link #getNonlinearShuntCompensatorPhasePoints() <em>Nonlinear Shunt Compensator Phase Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNonlinearShuntCompensatorPhasePoints()
     * @generated
     * @ordered
     */
    protected EList< NonlinearShuntCompensatorPhasePoint > nonlinearShuntCompensatorPhasePoints;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NonlinearShuntCompensatorPhaseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getNonlinearShuntCompensatorPhase();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< NonlinearShuntCompensatorPhasePoint > getNonlinearShuntCompensatorPhasePoints() {
        if( nonlinearShuntCompensatorPhasePoints == null ) {
            nonlinearShuntCompensatorPhasePoints = new EObjectWithInverseResolvingEList.Unsettable< NonlinearShuntCompensatorPhasePoint >(
                    NonlinearShuntCompensatorPhasePoint.class, this,
                    CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE__NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINTS,
                    CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT__NONLINEAR_SHUNT_COMPENSATOR_PHASE );
        }
        return nonlinearShuntCompensatorPhasePoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNonlinearShuntCompensatorPhasePoints() {
        if( nonlinearShuntCompensatorPhasePoints != null )
            ( ( InternalEList.Unsettable< ? > ) nonlinearShuntCompensatorPhasePoints ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNonlinearShuntCompensatorPhasePoints() {
        return nonlinearShuntCompensatorPhasePoints != null
                && ( ( InternalEList.Unsettable< ? > ) nonlinearShuntCompensatorPhasePoints ).isSet();
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE__NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getNonlinearShuntCompensatorPhasePoints() )
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE__NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINTS:
            return ( ( InternalEList< ? > ) getNonlinearShuntCompensatorPhasePoints() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE__NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINTS:
            return getNonlinearShuntCompensatorPhasePoints();
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE__NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINTS:
            getNonlinearShuntCompensatorPhasePoints().clear();
            getNonlinearShuntCompensatorPhasePoints()
                    .addAll( ( Collection< ? extends NonlinearShuntCompensatorPhasePoint > ) newValue );
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE__NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINTS:
            unsetNonlinearShuntCompensatorPhasePoints();
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE__NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINTS:
            return isSetNonlinearShuntCompensatorPhasePoints();
        }
        return super.eIsSet( featureID );
    }

} //NonlinearShuntCompensatorPhaseImpl
