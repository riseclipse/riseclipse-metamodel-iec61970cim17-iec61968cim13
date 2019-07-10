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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Incident;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Operator;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStep;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperatorImpl#getIncidents <em>Incidents</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperatorImpl#getSwitchingSteps <em>Switching Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatorImpl extends OperationPersonRoleImpl implements Operator {
    /**
     * The cached value of the '{@link #getIncidents() <em>Incidents</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncidents()
     * @generated
     * @ordered
     */
    protected EList< Incident > incidents;

    /**
     * The cached value of the '{@link #getSwitchingSteps() <em>Switching Steps</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchingSteps()
     * @generated
     * @ordered
     */
    protected EList< SwitchingStep > switchingSteps;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOperator();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Incident > getIncidents() {
        if( incidents == null ) {
            incidents = new EObjectWithInverseResolvingEList.Unsettable< Incident >( Incident.class, this,
                    CimPackage.OPERATOR__INCIDENTS, CimPackage.INCIDENT__OWNER );
        }
        return incidents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIncidents() {
        if( incidents != null ) ( ( InternalEList.Unsettable< ? > ) incidents ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIncidents() {
        return incidents != null && ( ( InternalEList.Unsettable< ? > ) incidents ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SwitchingStep > getSwitchingSteps() {
        if( switchingSteps == null ) {
            switchingSteps = new EObjectWithInverseResolvingEList.Unsettable< SwitchingStep >( SwitchingStep.class,
                    this, CimPackage.OPERATOR__SWITCHING_STEPS, CimPackage.SWITCHING_STEP__OPERATOR );
        }
        return switchingSteps;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSwitchingSteps() {
        if( switchingSteps != null ) ( ( InternalEList.Unsettable< ? > ) switchingSteps ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchingSteps() {
        return switchingSteps != null && ( ( InternalEList.Unsettable< ? > ) switchingSteps ).isSet();
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
        case CimPackage.OPERATOR__INCIDENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getIncidents() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.OPERATOR__SWITCHING_STEPS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSwitchingSteps() )
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
        case CimPackage.OPERATOR__INCIDENTS:
            return ( ( InternalEList< ? > ) getIncidents() ).basicRemove( otherEnd, msgs );
        case CimPackage.OPERATOR__SWITCHING_STEPS:
            return ( ( InternalEList< ? > ) getSwitchingSteps() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.OPERATOR__INCIDENTS:
            return getIncidents();
        case CimPackage.OPERATOR__SWITCHING_STEPS:
            return getSwitchingSteps();
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
        case CimPackage.OPERATOR__INCIDENTS:
            getIncidents().clear();
            getIncidents().addAll( ( Collection< ? extends Incident > ) newValue );
            return;
        case CimPackage.OPERATOR__SWITCHING_STEPS:
            getSwitchingSteps().clear();
            getSwitchingSteps().addAll( ( Collection< ? extends SwitchingStep > ) newValue );
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
        case CimPackage.OPERATOR__INCIDENTS:
            unsetIncidents();
            return;
        case CimPackage.OPERATOR__SWITCHING_STEPS:
            unsetSwitchingSteps();
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
        case CimPackage.OPERATOR__INCIDENTS:
            return isSetIncidents();
        case CimPackage.OPERATOR__SWITCHING_STEPS:
            return isSetSwitchingSteps();
        }
        return super.eIsSet( featureID );
    }

} //OperatorImpl
