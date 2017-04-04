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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceLocation;
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
 * An implementation of the model object '<em><b>Service Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ServiceLocationImpl#getAccessMethod <em>Access Method</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ServiceLocationImpl#getNeedsInspection <em>Needs Inspection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ServiceLocationImpl#getSiteAccessProblem <em>Site Access Problem</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ServiceLocationImpl#getUsagePoints <em>Usage Points</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ServiceLocationImpl#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ServiceLocationImpl#getEndDevices <em>End Devices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLocationImpl extends WorkLocationImpl implements ServiceLocation {
    /**
     * The default value of the '{@link #getAccessMethod() <em>Access Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccessMethod()
     * @generated
     * @ordered
     */
    protected static final String ACCESS_METHOD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAccessMethod() <em>Access Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccessMethod()
     * @generated
     * @ordered
     */
    protected String accessMethod = ACCESS_METHOD_EDEFAULT;

    /**
     * This is true if the Access Method attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean accessMethodESet;

    /**
     * The default value of the '{@link #getNeedsInspection() <em>Needs Inspection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeedsInspection()
     * @generated
     * @ordered
     */
    protected static final Boolean NEEDS_INSPECTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNeedsInspection() <em>Needs Inspection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeedsInspection()
     * @generated
     * @ordered
     */
    protected Boolean needsInspection = NEEDS_INSPECTION_EDEFAULT;

    /**
     * This is true if the Needs Inspection attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean needsInspectionESet;

    /**
     * The default value of the '{@link #getSiteAccessProblem() <em>Site Access Problem</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSiteAccessProblem()
     * @generated
     * @ordered
     */
    protected static final String SITE_ACCESS_PROBLEM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSiteAccessProblem() <em>Site Access Problem</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSiteAccessProblem()
     * @generated
     * @ordered
     */
    protected String siteAccessProblem = SITE_ACCESS_PROBLEM_EDEFAULT;

    /**
     * This is true if the Site Access Problem attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean siteAccessProblemESet;

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
     * The cached value of the '{@link #getCustomerAgreements() <em>Customer Agreements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerAgreements()
     * @generated
     * @ordered
     */
    protected EList< CustomerAgreement > customerAgreements;

    /**
     * The cached value of the '{@link #getEndDevices() <em>End Devices</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDevices()
     * @generated
     * @ordered
     */
    protected EList< EndDevice > endDevices;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceLocationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getServiceLocation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAccessMethod() {
        return accessMethod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAccessMethod( String newAccessMethod ) {
        String oldAccessMethod = accessMethod;
        accessMethod = newAccessMethod;
        boolean oldAccessMethodESet = accessMethodESet;
        accessMethodESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SERVICE_LOCATION__ACCESS_METHOD, oldAccessMethod, accessMethod, !oldAccessMethodESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAccessMethod() {
        String oldAccessMethod = accessMethod;
        boolean oldAccessMethodESet = accessMethodESet;
        accessMethod = ACCESS_METHOD_EDEFAULT;
        accessMethodESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SERVICE_LOCATION__ACCESS_METHOD,
                    oldAccessMethod, ACCESS_METHOD_EDEFAULT, oldAccessMethodESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccessMethod() {
        return accessMethodESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getNeedsInspection() {
        return needsInspection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNeedsInspection( Boolean newNeedsInspection ) {
        Boolean oldNeedsInspection = needsInspection;
        needsInspection = newNeedsInspection;
        boolean oldNeedsInspectionESet = needsInspectionESet;
        needsInspectionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SERVICE_LOCATION__NEEDS_INSPECTION,
                    oldNeedsInspection, needsInspection, !oldNeedsInspectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNeedsInspection() {
        Boolean oldNeedsInspection = needsInspection;
        boolean oldNeedsInspectionESet = needsInspectionESet;
        needsInspection = NEEDS_INSPECTION_EDEFAULT;
        needsInspectionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SERVICE_LOCATION__NEEDS_INSPECTION,
                    oldNeedsInspection, NEEDS_INSPECTION_EDEFAULT, oldNeedsInspectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNeedsInspection() {
        return needsInspectionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSiteAccessProblem() {
        return siteAccessProblem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSiteAccessProblem( String newSiteAccessProblem ) {
        String oldSiteAccessProblem = siteAccessProblem;
        siteAccessProblem = newSiteAccessProblem;
        boolean oldSiteAccessProblemESet = siteAccessProblemESet;
        siteAccessProblemESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SERVICE_LOCATION__SITE_ACCESS_PROBLEM,
                    oldSiteAccessProblem, siteAccessProblem, !oldSiteAccessProblemESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSiteAccessProblem() {
        String oldSiteAccessProblem = siteAccessProblem;
        boolean oldSiteAccessProblemESet = siteAccessProblemESet;
        siteAccessProblem = SITE_ACCESS_PROBLEM_EDEFAULT;
        siteAccessProblemESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SERVICE_LOCATION__SITE_ACCESS_PROBLEM,
                    oldSiteAccessProblem, SITE_ACCESS_PROBLEM_EDEFAULT, oldSiteAccessProblemESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSiteAccessProblem() {
        return siteAccessProblemESet;
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
                    CimPackage.SERVICE_LOCATION__USAGE_POINTS, CimPackage.USAGE_POINT__SERVICE_LOCATION );
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
    @Override
    public EList< CustomerAgreement > getCustomerAgreements() {
        if( customerAgreements == null ) {
            customerAgreements = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< CustomerAgreement >(
                    CustomerAgreement.class, this, CimPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS,
                    CimPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS );
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
    public EList< EndDevice > getEndDevices() {
        if( endDevices == null ) {
            endDevices = new EObjectWithInverseResolvingEList.Unsettable< EndDevice >( EndDevice.class, this,
                    CimPackage.SERVICE_LOCATION__END_DEVICES, CimPackage.END_DEVICE__SERVICE_LOCATION );
        }
        return endDevices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDevices() {
        if( endDevices != null ) ( ( InternalEList.Unsettable< ? > ) endDevices ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDevices() {
        return endDevices != null && ( ( InternalEList.Unsettable< ? > ) endDevices ).isSet();
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
        case CimPackage.SERVICE_LOCATION__USAGE_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getUsagePoints() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCustomerAgreements() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SERVICE_LOCATION__END_DEVICES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDevices() ).basicAdd( otherEnd,
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
        case CimPackage.SERVICE_LOCATION__USAGE_POINTS:
            return ( ( InternalEList< ? > ) getUsagePoints() ).basicRemove( otherEnd, msgs );
        case CimPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
            return ( ( InternalEList< ? > ) getCustomerAgreements() ).basicRemove( otherEnd, msgs );
        case CimPackage.SERVICE_LOCATION__END_DEVICES:
            return ( ( InternalEList< ? > ) getEndDevices() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.SERVICE_LOCATION__ACCESS_METHOD:
            return getAccessMethod();
        case CimPackage.SERVICE_LOCATION__NEEDS_INSPECTION:
            return getNeedsInspection();
        case CimPackage.SERVICE_LOCATION__SITE_ACCESS_PROBLEM:
            return getSiteAccessProblem();
        case CimPackage.SERVICE_LOCATION__USAGE_POINTS:
            return getUsagePoints();
        case CimPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
            return getCustomerAgreements();
        case CimPackage.SERVICE_LOCATION__END_DEVICES:
            return getEndDevices();
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
        case CimPackage.SERVICE_LOCATION__ACCESS_METHOD:
            setAccessMethod( ( String ) newValue );
            return;
        case CimPackage.SERVICE_LOCATION__NEEDS_INSPECTION:
            setNeedsInspection( ( Boolean ) newValue );
            return;
        case CimPackage.SERVICE_LOCATION__SITE_ACCESS_PROBLEM:
            setSiteAccessProblem( ( String ) newValue );
            return;
        case CimPackage.SERVICE_LOCATION__USAGE_POINTS:
            getUsagePoints().clear();
            getUsagePoints().addAll( ( Collection< ? extends UsagePoint > ) newValue );
            return;
        case CimPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
            getCustomerAgreements().clear();
            getCustomerAgreements().addAll( ( Collection< ? extends CustomerAgreement > ) newValue );
            return;
        case CimPackage.SERVICE_LOCATION__END_DEVICES:
            getEndDevices().clear();
            getEndDevices().addAll( ( Collection< ? extends EndDevice > ) newValue );
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
        case CimPackage.SERVICE_LOCATION__ACCESS_METHOD:
            unsetAccessMethod();
            return;
        case CimPackage.SERVICE_LOCATION__NEEDS_INSPECTION:
            unsetNeedsInspection();
            return;
        case CimPackage.SERVICE_LOCATION__SITE_ACCESS_PROBLEM:
            unsetSiteAccessProblem();
            return;
        case CimPackage.SERVICE_LOCATION__USAGE_POINTS:
            unsetUsagePoints();
            return;
        case CimPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
            unsetCustomerAgreements();
            return;
        case CimPackage.SERVICE_LOCATION__END_DEVICES:
            unsetEndDevices();
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
        case CimPackage.SERVICE_LOCATION__ACCESS_METHOD:
            return isSetAccessMethod();
        case CimPackage.SERVICE_LOCATION__NEEDS_INSPECTION:
            return isSetNeedsInspection();
        case CimPackage.SERVICE_LOCATION__SITE_ACCESS_PROBLEM:
            return isSetSiteAccessProblem();
        case CimPackage.SERVICE_LOCATION__USAGE_POINTS:
            return isSetUsagePoints();
        case CimPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
            return isSetCustomerAgreements();
        case CimPackage.SERVICE_LOCATION__END_DEVICES:
            return isSetEndDevices();
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
        result.append( " (accessMethod: " );
        if( accessMethodESet )
            result.append( accessMethod );
        else
            result.append( "<unset>" );
        result.append( ", needsInspection: " );
        if( needsInspectionESet )
            result.append( needsInspection );
        else
            result.append( "<unset>" );
        result.append( ", siteAccessProblem: " );
        if( siteAccessProblemESet )
            result.append( siteAccessProblem );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ServiceLocationImpl
