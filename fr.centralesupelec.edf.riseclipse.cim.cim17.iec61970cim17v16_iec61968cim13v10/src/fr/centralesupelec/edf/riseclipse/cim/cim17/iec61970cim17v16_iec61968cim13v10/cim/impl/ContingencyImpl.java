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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Contingency;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyElement;

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
 * An implementation of the model object '<em><b>Contingency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ContingencyImpl#getMustStudy <em>Must Study</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ContingencyImpl#getContingencyElement <em>Contingency Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContingencyImpl extends IdentifiedObjectImpl implements Contingency {
    /**
     * The default value of the '{@link #getMustStudy() <em>Must Study</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMustStudy()
     * @generated
     * @ordered
     */
    protected static final Boolean MUST_STUDY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMustStudy() <em>Must Study</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMustStudy()
     * @generated
     * @ordered
     */
    protected Boolean mustStudy = MUST_STUDY_EDEFAULT;

    /**
     * This is true if the Must Study attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mustStudyESet;

    /**
     * The cached value of the '{@link #getContingencyElement() <em>Contingency Element</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContingencyElement()
     * @generated
     * @ordered
     */
    protected EList< ContingencyElement > contingencyElement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContingencyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getContingency();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMustStudy() {
        return mustStudy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMustStudy( Boolean newMustStudy ) {
        Boolean oldMustStudy = mustStudy;
        mustStudy = newMustStudy;
        boolean oldMustStudyESet = mustStudyESet;
        mustStudyESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONTINGENCY__MUST_STUDY, oldMustStudy, mustStudy, !oldMustStudyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMustStudy() {
        Boolean oldMustStudy = mustStudy;
        boolean oldMustStudyESet = mustStudyESet;
        mustStudy = MUST_STUDY_EDEFAULT;
        mustStudyESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONTINGENCY__MUST_STUDY, oldMustStudy, MUST_STUDY_EDEFAULT, oldMustStudyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMustStudy() {
        return mustStudyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ContingencyElement > getContingencyElement() {
        if( contingencyElement == null ) {
            contingencyElement = new EObjectWithInverseResolvingEList.Unsettable< ContingencyElement >(
                    ContingencyElement.class, this, CimPackage.CONTINGENCY__CONTINGENCY_ELEMENT,
                    CimPackage.CONTINGENCY_ELEMENT__CONTINGENCY );
        }
        return contingencyElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetContingencyElement() {
        if( contingencyElement != null ) ( ( InternalEList.Unsettable< ? > ) contingencyElement ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetContingencyElement() {
        return contingencyElement != null && ( ( InternalEList.Unsettable< ? > ) contingencyElement ).isSet();
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
        case CimPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getContingencyElement() )
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
        case CimPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
            return ( ( InternalEList< ? > ) getContingencyElement() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.CONTINGENCY__MUST_STUDY:
            return getMustStudy();
        case CimPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
            return getContingencyElement();
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
        case CimPackage.CONTINGENCY__MUST_STUDY:
            setMustStudy( ( Boolean ) newValue );
            return;
        case CimPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
            getContingencyElement().clear();
            getContingencyElement().addAll( ( Collection< ? extends ContingencyElement > ) newValue );
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
        case CimPackage.CONTINGENCY__MUST_STUDY:
            unsetMustStudy();
            return;
        case CimPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
            unsetContingencyElement();
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
        case CimPackage.CONTINGENCY__MUST_STUDY:
            return isSetMustStudy();
        case CimPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
            return isSetContingencyElement();
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
        result.append( " (mustStudy: " );
        if( mustStudyESet )
            result.append( mustStudy );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ContingencyImpl
