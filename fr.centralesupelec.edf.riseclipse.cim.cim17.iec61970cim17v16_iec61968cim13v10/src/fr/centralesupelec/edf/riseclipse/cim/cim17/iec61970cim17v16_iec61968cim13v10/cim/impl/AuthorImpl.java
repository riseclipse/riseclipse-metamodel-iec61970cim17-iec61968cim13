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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ActivityRecord;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Author;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Document;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuthorImpl#getDocuments <em>Documents</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AuthorImpl#getActivityRecords <em>Activity Records</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorImpl extends DocumentPersonRoleImpl implements Author {
    /**
     * The cached value of the '{@link #getDocuments() <em>Documents</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDocuments()
     * @generated
     * @ordered
     */
    protected EList< Document > documents;

    /**
     * The cached value of the '{@link #getActivityRecords() <em>Activity Records</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivityRecords()
     * @generated
     * @ordered
     */
    protected EList< ActivityRecord > activityRecords;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AuthorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAuthor();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Document > getDocuments() {
        if( documents == null ) {
            documents = new EObjectWithInverseResolvingEList.Unsettable< Document >( Document.class, this,
                    CimPackage.AUTHOR__DOCUMENTS, CimPackage.DOCUMENT__AUTHOR );
        }
        return documents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDocuments() {
        if( documents != null ) ( ( InternalEList.Unsettable< ? > ) documents ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDocuments() {
        return documents != null && ( ( InternalEList.Unsettable< ? > ) documents ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ActivityRecord > getActivityRecords() {
        if( activityRecords == null ) {
            activityRecords = new EObjectWithInverseResolvingEList.Unsettable< ActivityRecord >( ActivityRecord.class,
                    this, CimPackage.AUTHOR__ACTIVITY_RECORDS, CimPackage.ACTIVITY_RECORD__AUTHOR );
        }
        return activityRecords;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetActivityRecords() {
        if( activityRecords != null ) ( ( InternalEList.Unsettable< ? > ) activityRecords ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetActivityRecords() {
        return activityRecords != null && ( ( InternalEList.Unsettable< ? > ) activityRecords ).isSet();
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
        case CimPackage.AUTHOR__DOCUMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDocuments() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.AUTHOR__ACTIVITY_RECORDS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getActivityRecords() )
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
        case CimPackage.AUTHOR__DOCUMENTS:
            return ( ( InternalEList< ? > ) getDocuments() ).basicRemove( otherEnd, msgs );
        case CimPackage.AUTHOR__ACTIVITY_RECORDS:
            return ( ( InternalEList< ? > ) getActivityRecords() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.AUTHOR__DOCUMENTS:
            return getDocuments();
        case CimPackage.AUTHOR__ACTIVITY_RECORDS:
            return getActivityRecords();
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
        case CimPackage.AUTHOR__DOCUMENTS:
            getDocuments().clear();
            getDocuments().addAll( ( Collection< ? extends Document > ) newValue );
            return;
        case CimPackage.AUTHOR__ACTIVITY_RECORDS:
            getActivityRecords().clear();
            getActivityRecords().addAll( ( Collection< ? extends ActivityRecord > ) newValue );
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
        case CimPackage.AUTHOR__DOCUMENTS:
            unsetDocuments();
            return;
        case CimPackage.AUTHOR__ACTIVITY_RECORDS:
            unsetActivityRecords();
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
        case CimPackage.AUTHOR__DOCUMENTS:
            return isSetDocuments();
        case CimPackage.AUTHOR__ACTIVITY_RECORDS:
            return isSetActivityRecords();
        }
        return super.eIsSet( featureID );
    }

} //AuthorImpl
