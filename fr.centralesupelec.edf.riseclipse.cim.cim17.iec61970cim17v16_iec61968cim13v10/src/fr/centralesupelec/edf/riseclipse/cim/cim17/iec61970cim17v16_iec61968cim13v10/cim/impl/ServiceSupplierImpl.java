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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceSupplier;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SupplierKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint;

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
 * An implementation of the model object '<em><b>Service Supplier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ServiceSupplierImpl#getIssuerIdentificationNumber <em>Issuer Identification Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ServiceSupplierImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ServiceSupplierImpl#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ServiceSupplierImpl#getUsagePoints <em>Usage Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceSupplierImpl extends OrganisationRoleImpl implements ServiceSupplier {
    /**
     * The default value of the '{@link #getIssuerIdentificationNumber() <em>Issuer Identification Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIssuerIdentificationNumber()
     * @generated
     * @ordered
     */
    protected static final String ISSUER_IDENTIFICATION_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIssuerIdentificationNumber() <em>Issuer Identification Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIssuerIdentificationNumber()
     * @generated
     * @ordered
     */
    protected String issuerIdentificationNumber = ISSUER_IDENTIFICATION_NUMBER_EDEFAULT;

    /**
     * This is true if the Issuer Identification Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean issuerIdentificationNumberESet;

    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final SupplierKind KIND_EDEFAULT = SupplierKind.UTILITY;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected SupplierKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The cached value of the '{@link #getCustomerAgreements() <em>Customer Agreements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerAgreements()
     * @generated
     * @ordered
     */
    protected EList< CustomerAgreement > customerAgreements;

    /**
     * The cached value of the '{@link #getUsagePoints() <em>Usage Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsagePoints()
     * @generated
     * @ordered
     */
    protected EList< UsagePoint > usagePoints;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceSupplierImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getServiceSupplier();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIssuerIdentificationNumber() {
        return issuerIdentificationNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIssuerIdentificationNumber( String newIssuerIdentificationNumber ) {
        String oldIssuerIdentificationNumber = issuerIdentificationNumber;
        issuerIdentificationNumber = newIssuerIdentificationNumber;
        boolean oldIssuerIdentificationNumberESet = issuerIdentificationNumberESet;
        issuerIdentificationNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER, oldIssuerIdentificationNumber,
                issuerIdentificationNumber, !oldIssuerIdentificationNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIssuerIdentificationNumber() {
        String oldIssuerIdentificationNumber = issuerIdentificationNumber;
        boolean oldIssuerIdentificationNumberESet = issuerIdentificationNumberESet;
        issuerIdentificationNumber = ISSUER_IDENTIFICATION_NUMBER_EDEFAULT;
        issuerIdentificationNumberESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER, oldIssuerIdentificationNumber,
                ISSUER_IDENTIFICATION_NUMBER_EDEFAULT, oldIssuerIdentificationNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIssuerIdentificationNumber() {
        return issuerIdentificationNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SupplierKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( SupplierKind newKind ) {
        SupplierKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SERVICE_SUPPLIER__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        SupplierKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SERVICE_SUPPLIER__KIND, oldKind, KIND_EDEFAULT, oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKind() {
        return kindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CustomerAgreement > getCustomerAgreements() {
        if( customerAgreements == null ) {
            customerAgreements = new EObjectWithInverseResolvingEList.Unsettable< CustomerAgreement >(
                    CustomerAgreement.class, this, CimPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS,
                    CimPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER );
        }
        return customerAgreements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCustomerAgreements() {
        if( customerAgreements != null ) ( ( InternalEList.Unsettable< ? > ) customerAgreements ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomerAgreements() {
        return customerAgreements != null && ( ( InternalEList.Unsettable< ? > ) customerAgreements ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< UsagePoint > getUsagePoints() {
        if( usagePoints == null ) {
            usagePoints = new EObjectWithInverseResolvingEList.Unsettable< UsagePoint >( UsagePoint.class, this,
                    CimPackage.SERVICE_SUPPLIER__USAGE_POINTS, CimPackage.USAGE_POINT__SERVICE_SUPPLIER );
        }
        return usagePoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsagePoints() {
        if( usagePoints != null ) ( ( InternalEList.Unsettable< ? > ) usagePoints ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsagePoints() {
        return usagePoints != null && ( ( InternalEList.Unsettable< ? > ) usagePoints ).isSet();
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
        case CimPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCustomerAgreements() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SERVICE_SUPPLIER__USAGE_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getUsagePoints() ).basicAdd( otherEnd,
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
        case CimPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
            return ( ( InternalEList< ? > ) getCustomerAgreements() ).basicRemove( otherEnd, msgs );
        case CimPackage.SERVICE_SUPPLIER__USAGE_POINTS:
            return ( ( InternalEList< ? > ) getUsagePoints() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER:
            return getIssuerIdentificationNumber();
        case CimPackage.SERVICE_SUPPLIER__KIND:
            return getKind();
        case CimPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
            return getCustomerAgreements();
        case CimPackage.SERVICE_SUPPLIER__USAGE_POINTS:
            return getUsagePoints();
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
        case CimPackage.SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER:
            setIssuerIdentificationNumber( ( String ) newValue );
            return;
        case CimPackage.SERVICE_SUPPLIER__KIND:
            setKind( ( SupplierKind ) newValue );
            return;
        case CimPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
            getCustomerAgreements().clear();
            getCustomerAgreements().addAll( ( Collection< ? extends CustomerAgreement > ) newValue );
            return;
        case CimPackage.SERVICE_SUPPLIER__USAGE_POINTS:
            getUsagePoints().clear();
            getUsagePoints().addAll( ( Collection< ? extends UsagePoint > ) newValue );
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
        case CimPackage.SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER:
            unsetIssuerIdentificationNumber();
            return;
        case CimPackage.SERVICE_SUPPLIER__KIND:
            unsetKind();
            return;
        case CimPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
            unsetCustomerAgreements();
            return;
        case CimPackage.SERVICE_SUPPLIER__USAGE_POINTS:
            unsetUsagePoints();
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
        case CimPackage.SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER:
            return isSetIssuerIdentificationNumber();
        case CimPackage.SERVICE_SUPPLIER__KIND:
            return isSetKind();
        case CimPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
            return isSetCustomerAgreements();
        case CimPackage.SERVICE_SUPPLIER__USAGE_POINTS:
            return isSetUsagePoints();
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
        result.append( " (issuerIdentificationNumber: " );
        if( issuerIdentificationNumberESet )
            result.append( issuerIdentificationNumber );
        else
            result.append( "<unset>" );
        result.append( ", kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ServiceSupplierImpl
