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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationsSafetySupervisor;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operations Safety Supervisor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperationsSafetySupervisorImpl#getIssuedSafetyDocuments <em>Issued Safety Documents</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperationsSafetySupervisorImpl#getReleasedSafetyDocuments <em>Released Safety Documents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationsSafetySupervisorImpl extends OperatorImpl implements OperationsSafetySupervisor {
    /**
     * The cached value of the '{@link #getIssuedSafetyDocuments() <em>Issued Safety Documents</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIssuedSafetyDocuments()
     * @generated
     * @ordered
     */
    protected EList< SafetyDocument > issuedSafetyDocuments;

    /**
     * The cached value of the '{@link #getReleasedSafetyDocuments() <em>Released Safety Documents</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReleasedSafetyDocuments()
     * @generated
     * @ordered
     */
    protected EList< SafetyDocument > releasedSafetyDocuments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationsSafetySupervisorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOperationsSafetySupervisor();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SafetyDocument > getIssuedSafetyDocuments() {
        if( issuedSafetyDocuments == null ) {
            issuedSafetyDocuments = new EObjectWithInverseResolvingEList.Unsettable< SafetyDocument >(
                    SafetyDocument.class, this, CimPackage.OPERATIONS_SAFETY_SUPERVISOR__ISSUED_SAFETY_DOCUMENTS,
                    CimPackage.SAFETY_DOCUMENT__ISSUED_BY_SUPERVISOR );
        }
        return issuedSafetyDocuments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIssuedSafetyDocuments() {
        if( issuedSafetyDocuments != null ) ( ( InternalEList.Unsettable< ? > ) issuedSafetyDocuments ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIssuedSafetyDocuments() {
        return issuedSafetyDocuments != null && ( ( InternalEList.Unsettable< ? > ) issuedSafetyDocuments ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SafetyDocument > getReleasedSafetyDocuments() {
        if( releasedSafetyDocuments == null ) {
            releasedSafetyDocuments = new EObjectWithInverseResolvingEList.Unsettable< SafetyDocument >(
                    SafetyDocument.class, this, CimPackage.OPERATIONS_SAFETY_SUPERVISOR__RELEASED_SAFETY_DOCUMENTS,
                    CimPackage.SAFETY_DOCUMENT__RELEASED_TO_SUPERVISOR );
        }
        return releasedSafetyDocuments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReleasedSafetyDocuments() {
        if( releasedSafetyDocuments != null ) ( ( InternalEList.Unsettable< ? > ) releasedSafetyDocuments ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReleasedSafetyDocuments() {
        return releasedSafetyDocuments != null && ( ( InternalEList.Unsettable< ? > ) releasedSafetyDocuments ).isSet();
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
        case CimPackage.OPERATIONS_SAFETY_SUPERVISOR__ISSUED_SAFETY_DOCUMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getIssuedSafetyDocuments() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.OPERATIONS_SAFETY_SUPERVISOR__RELEASED_SAFETY_DOCUMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReleasedSafetyDocuments() )
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
        case CimPackage.OPERATIONS_SAFETY_SUPERVISOR__ISSUED_SAFETY_DOCUMENTS:
            return ( ( InternalEList< ? > ) getIssuedSafetyDocuments() ).basicRemove( otherEnd, msgs );
        case CimPackage.OPERATIONS_SAFETY_SUPERVISOR__RELEASED_SAFETY_DOCUMENTS:
            return ( ( InternalEList< ? > ) getReleasedSafetyDocuments() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.OPERATIONS_SAFETY_SUPERVISOR__ISSUED_SAFETY_DOCUMENTS:
            return getIssuedSafetyDocuments();
        case CimPackage.OPERATIONS_SAFETY_SUPERVISOR__RELEASED_SAFETY_DOCUMENTS:
            return getReleasedSafetyDocuments();
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
        case CimPackage.OPERATIONS_SAFETY_SUPERVISOR__ISSUED_SAFETY_DOCUMENTS:
            getIssuedSafetyDocuments().clear();
            getIssuedSafetyDocuments().addAll( ( Collection< ? extends SafetyDocument > ) newValue );
            return;
        case CimPackage.OPERATIONS_SAFETY_SUPERVISOR__RELEASED_SAFETY_DOCUMENTS:
            getReleasedSafetyDocuments().clear();
            getReleasedSafetyDocuments().addAll( ( Collection< ? extends SafetyDocument > ) newValue );
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
        case CimPackage.OPERATIONS_SAFETY_SUPERVISOR__ISSUED_SAFETY_DOCUMENTS:
            unsetIssuedSafetyDocuments();
            return;
        case CimPackage.OPERATIONS_SAFETY_SUPERVISOR__RELEASED_SAFETY_DOCUMENTS:
            unsetReleasedSafetyDocuments();
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
        case CimPackage.OPERATIONS_SAFETY_SUPERVISOR__ISSUED_SAFETY_DOCUMENTS:
            return isSetIssuedSafetyDocuments();
        case CimPackage.OPERATIONS_SAFETY_SUPERVISOR__RELEASED_SAFETY_DOCUMENTS:
            return isSetReleasedSafetyDocuments();
        }
        return super.eIsSet( featureID );
    }

} //OperationsSafetySupervisorImpl
