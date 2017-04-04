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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPInformationMessage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPScope;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ICCP Information Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPInformationMessageImpl#getLocalReference <em>Local Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPInformationMessageImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPInformationMessageImpl#getTASE2BilateralTable <em>TASE2 Bilateral Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ICCPInformationMessageImpl extends IdentifiedObjectImpl implements ICCPInformationMessage {
    /**
     * The default value of the '{@link #getLocalReference() <em>Local Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalReference()
     * @generated
     * @ordered
     */
    protected static final String LOCAL_REFERENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalReference() <em>Local Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalReference()
     * @generated
     * @ordered
     */
    protected String localReference = LOCAL_REFERENCE_EDEFAULT;

    /**
     * This is true if the Local Reference attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean localReferenceESet;

    /**
     * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
    protected static final ICCPScope SCOPE_EDEFAULT = ICCPScope.VCC;

    /**
     * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
    protected ICCPScope scope = SCOPE_EDEFAULT;

    /**
     * This is true if the Scope attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean scopeESet;

    /**
     * The cached value of the '{@link #getTASE2BilateralTable() <em>TASE2 Bilateral Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTASE2BilateralTable()
     * @generated
     * @ordered
     */
    protected EList< TASE2BilateralTable > tase2BilateralTable;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ICCPInformationMessageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getICCPInformationMessage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLocalReference() {
        return localReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLocalReference( String newLocalReference ) {
        String oldLocalReference = localReference;
        localReference = newLocalReference;
        boolean oldLocalReferenceESet = localReferenceESet;
        localReferenceESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ICCP_INFORMATION_MESSAGE__LOCAL_REFERENCE,
                        oldLocalReference, localReference, !oldLocalReferenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLocalReference() {
        String oldLocalReference = localReference;
        boolean oldLocalReferenceESet = localReferenceESet;
        localReference = LOCAL_REFERENCE_EDEFAULT;
        localReferenceESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.ICCP_INFORMATION_MESSAGE__LOCAL_REFERENCE,
                        oldLocalReference, LOCAL_REFERENCE_EDEFAULT, oldLocalReferenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLocalReference() {
        return localReferenceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ICCPScope getScope() {
        return scope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setScope( ICCPScope newScope ) {
        ICCPScope oldScope = scope;
        scope = newScope == null ? SCOPE_EDEFAULT : newScope;
        boolean oldScopeESet = scopeESet;
        scopeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ICCP_INFORMATION_MESSAGE__SCOPE, oldScope, scope, !oldScopeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetScope() {
        ICCPScope oldScope = scope;
        boolean oldScopeESet = scopeESet;
        scope = SCOPE_EDEFAULT;
        scopeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ICCP_INFORMATION_MESSAGE__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetScope() {
        return scopeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TASE2BilateralTable > getTASE2BilateralTable() {
        if( tase2BilateralTable == null ) {
            tase2BilateralTable = new EObjectWithInverseEList.Unsettable.ManyInverse< TASE2BilateralTable >(
                    TASE2BilateralTable.class, this, CimPackage.ICCP_INFORMATION_MESSAGE__TASE2_BILATERAL_TABLE,
                    CimPackage.TASE2_BILATERAL_TABLE__ICCP_INFORMATION_MESSAGE );
        }
        return tase2BilateralTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTASE2BilateralTable() {
        if( tase2BilateralTable != null ) ( ( InternalEList.Unsettable< ? > ) tase2BilateralTable ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTASE2BilateralTable() {
        return tase2BilateralTable != null && ( ( InternalEList.Unsettable< ? > ) tase2BilateralTable ).isSet();
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
        case CimPackage.ICCP_INFORMATION_MESSAGE__TASE2_BILATERAL_TABLE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTASE2BilateralTable() )
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
        case CimPackage.ICCP_INFORMATION_MESSAGE__TASE2_BILATERAL_TABLE:
            return ( ( InternalEList< ? > ) getTASE2BilateralTable() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.ICCP_INFORMATION_MESSAGE__LOCAL_REFERENCE:
            return getLocalReference();
        case CimPackage.ICCP_INFORMATION_MESSAGE__SCOPE:
            return getScope();
        case CimPackage.ICCP_INFORMATION_MESSAGE__TASE2_BILATERAL_TABLE:
            return getTASE2BilateralTable();
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
        case CimPackage.ICCP_INFORMATION_MESSAGE__LOCAL_REFERENCE:
            setLocalReference( ( String ) newValue );
            return;
        case CimPackage.ICCP_INFORMATION_MESSAGE__SCOPE:
            setScope( ( ICCPScope ) newValue );
            return;
        case CimPackage.ICCP_INFORMATION_MESSAGE__TASE2_BILATERAL_TABLE:
            getTASE2BilateralTable().clear();
            getTASE2BilateralTable().addAll( ( Collection< ? extends TASE2BilateralTable > ) newValue );
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
        case CimPackage.ICCP_INFORMATION_MESSAGE__LOCAL_REFERENCE:
            unsetLocalReference();
            return;
        case CimPackage.ICCP_INFORMATION_MESSAGE__SCOPE:
            unsetScope();
            return;
        case CimPackage.ICCP_INFORMATION_MESSAGE__TASE2_BILATERAL_TABLE:
            unsetTASE2BilateralTable();
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
        case CimPackage.ICCP_INFORMATION_MESSAGE__LOCAL_REFERENCE:
            return isSetLocalReference();
        case CimPackage.ICCP_INFORMATION_MESSAGE__SCOPE:
            return isSetScope();
        case CimPackage.ICCP_INFORMATION_MESSAGE__TASE2_BILATERAL_TABLE:
            return isSetTASE2BilateralTable();
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
        result.append( " (localReference: " );
        if( localReferenceESet )
            result.append( localReference );
        else
            result.append( "<unset>" );
        result.append( ", scope: " );
        if( scopeESet )
            result.append( scope );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ICCPInformationMessageImpl
