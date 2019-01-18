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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePointLocation;

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
 * An implementation of the model object '<em><b>Usage Point Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointLocationImpl#getAccessMethod <em>Access Method</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointLocationImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointLocationImpl#getSiteAccessProblem <em>Site Access Problem</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointLocationImpl#getUsagePoints <em>Usage Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsagePointLocationImpl extends LocationImpl implements UsagePointLocation {
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
     * The default value of the '{@link #getRemark() <em>Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemark()
     * @generated
     * @ordered
     */
    protected static final String REMARK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRemark() <em>Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemark()
     * @generated
     * @ordered
     */
    protected String remark = REMARK_EDEFAULT;

    /**
     * This is true if the Remark attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean remarkESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UsagePointLocationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getUsagePointLocation();
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
                CimPackage.USAGE_POINT_LOCATION__ACCESS_METHOD, oldAccessMethod, accessMethod, !oldAccessMethodESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.USAGE_POINT_LOCATION__ACCESS_METHOD,
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
    public String getRemark() {
        return remark;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRemark( String newRemark ) {
        String oldRemark = remark;
        remark = newRemark;
        boolean oldRemarkESet = remarkESet;
        remarkESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.USAGE_POINT_LOCATION__REMARK, oldRemark, remark, !oldRemarkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRemark() {
        String oldRemark = remark;
        boolean oldRemarkESet = remarkESet;
        remark = REMARK_EDEFAULT;
        remarkESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.USAGE_POINT_LOCATION__REMARK, oldRemark, REMARK_EDEFAULT, oldRemarkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemark() {
        return remarkESet;
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.USAGE_POINT_LOCATION__SITE_ACCESS_PROBLEM,
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.USAGE_POINT_LOCATION__SITE_ACCESS_PROBLEM,
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
                    CimPackage.USAGE_POINT_LOCATION__USAGE_POINTS, CimPackage.USAGE_POINT__USAGE_POINT_LOCATION );
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
        case CimPackage.USAGE_POINT_LOCATION__USAGE_POINTS:
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
        case CimPackage.USAGE_POINT_LOCATION__USAGE_POINTS:
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
        case CimPackage.USAGE_POINT_LOCATION__ACCESS_METHOD:
            return getAccessMethod();
        case CimPackage.USAGE_POINT_LOCATION__REMARK:
            return getRemark();
        case CimPackage.USAGE_POINT_LOCATION__SITE_ACCESS_PROBLEM:
            return getSiteAccessProblem();
        case CimPackage.USAGE_POINT_LOCATION__USAGE_POINTS:
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
        case CimPackage.USAGE_POINT_LOCATION__ACCESS_METHOD:
            setAccessMethod( ( String ) newValue );
            return;
        case CimPackage.USAGE_POINT_LOCATION__REMARK:
            setRemark( ( String ) newValue );
            return;
        case CimPackage.USAGE_POINT_LOCATION__SITE_ACCESS_PROBLEM:
            setSiteAccessProblem( ( String ) newValue );
            return;
        case CimPackage.USAGE_POINT_LOCATION__USAGE_POINTS:
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
        case CimPackage.USAGE_POINT_LOCATION__ACCESS_METHOD:
            unsetAccessMethod();
            return;
        case CimPackage.USAGE_POINT_LOCATION__REMARK:
            unsetRemark();
            return;
        case CimPackage.USAGE_POINT_LOCATION__SITE_ACCESS_PROBLEM:
            unsetSiteAccessProblem();
            return;
        case CimPackage.USAGE_POINT_LOCATION__USAGE_POINTS:
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
        case CimPackage.USAGE_POINT_LOCATION__ACCESS_METHOD:
            return isSetAccessMethod();
        case CimPackage.USAGE_POINT_LOCATION__REMARK:
            return isSetRemark();
        case CimPackage.USAGE_POINT_LOCATION__SITE_ACCESS_PROBLEM:
            return isSetSiteAccessProblem();
        case CimPackage.USAGE_POINT_LOCATION__USAGE_POINTS:
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

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (accessMethod: " );
        if( accessMethodESet )
            result.append( accessMethod );
        else
            result.append( "<unset>" );
        result.append( ", remark: " );
        if( remarkESet )
            result.append( remark );
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

} //UsagePointLocationImpl
