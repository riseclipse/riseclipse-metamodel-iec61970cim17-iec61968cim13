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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPAccessPrivilegeKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPPointKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPProvidedPoint;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPQualityKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPScope;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ICCP Provided Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPProvidedPointImpl#getAccessPriviledge <em>Access Priviledge</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPProvidedPointImpl#getPointQuality <em>Point Quality</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPProvidedPointImpl#getPointType <em>Point Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ICCPProvidedPointImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ICCPProvidedPointImpl extends ProvidedBilateralPointImpl implements ICCPProvidedPoint {
    /**
     * The default value of the '{@link #getAccessPriviledge() <em>Access Priviledge</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccessPriviledge()
     * @generated
     * @ordered
     */
    protected static final ICCPAccessPrivilegeKind ACCESS_PRIVILEDGE_EDEFAULT = ICCPAccessPrivilegeKind.READ_ONLY;

    /**
     * The cached value of the '{@link #getAccessPriviledge() <em>Access Priviledge</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccessPriviledge()
     * @generated
     * @ordered
     */
    protected ICCPAccessPrivilegeKind accessPriviledge = ACCESS_PRIVILEDGE_EDEFAULT;

    /**
     * This is true if the Access Priviledge attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean accessPriviledgeESet;

    /**
     * The default value of the '{@link #getPointQuality() <em>Point Quality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPointQuality()
     * @generated
     * @ordered
     */
    protected static final ICCPQualityKind POINT_QUALITY_EDEFAULT = ICCPQualityKind.NONE;

    /**
     * The cached value of the '{@link #getPointQuality() <em>Point Quality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPointQuality()
     * @generated
     * @ordered
     */
    protected ICCPQualityKind pointQuality = POINT_QUALITY_EDEFAULT;

    /**
     * This is true if the Point Quality attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pointQualityESet;

    /**
     * The default value of the '{@link #getPointType() <em>Point Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPointType()
     * @generated
     * @ordered
     */
    protected static final ICCPPointKind POINT_TYPE_EDEFAULT = ICCPPointKind.DISCRETE;

    /**
     * The cached value of the '{@link #getPointType() <em>Point Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPointType()
     * @generated
     * @ordered
     */
    protected ICCPPointKind pointType = POINT_TYPE_EDEFAULT;

    /**
     * This is true if the Point Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pointTypeESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ICCPProvidedPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getICCPProvidedPoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ICCPAccessPrivilegeKind getAccessPriviledge() {
        return accessPriviledge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAccessPriviledge( ICCPAccessPrivilegeKind newAccessPriviledge ) {
        ICCPAccessPrivilegeKind oldAccessPriviledge = accessPriviledge;
        accessPriviledge = newAccessPriviledge == null ? ACCESS_PRIVILEDGE_EDEFAULT : newAccessPriviledge;
        boolean oldAccessPriviledgeESet = accessPriviledgeESet;
        accessPriviledgeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ICCP_PROVIDED_POINT__ACCESS_PRIVILEDGE,
                    oldAccessPriviledge, accessPriviledge, !oldAccessPriviledgeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAccessPriviledge() {
        ICCPAccessPrivilegeKind oldAccessPriviledge = accessPriviledge;
        boolean oldAccessPriviledgeESet = accessPriviledgeESet;
        accessPriviledge = ACCESS_PRIVILEDGE_EDEFAULT;
        accessPriviledgeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ICCP_PROVIDED_POINT__ACCESS_PRIVILEDGE,
                    oldAccessPriviledge, ACCESS_PRIVILEDGE_EDEFAULT, oldAccessPriviledgeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccessPriviledge() {
        return accessPriviledgeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ICCPQualityKind getPointQuality() {
        return pointQuality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPointQuality( ICCPQualityKind newPointQuality ) {
        ICCPQualityKind oldPointQuality = pointQuality;
        pointQuality = newPointQuality == null ? POINT_QUALITY_EDEFAULT : newPointQuality;
        boolean oldPointQualityESet = pointQualityESet;
        pointQualityESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ICCP_PROVIDED_POINT__POINT_QUALITY, oldPointQuality, pointQuality, !oldPointQualityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPointQuality() {
        ICCPQualityKind oldPointQuality = pointQuality;
        boolean oldPointQualityESet = pointQualityESet;
        pointQuality = POINT_QUALITY_EDEFAULT;
        pointQualityESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ICCP_PROVIDED_POINT__POINT_QUALITY,
                    oldPointQuality, POINT_QUALITY_EDEFAULT, oldPointQualityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPointQuality() {
        return pointQualityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ICCPPointKind getPointType() {
        return pointType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPointType( ICCPPointKind newPointType ) {
        ICCPPointKind oldPointType = pointType;
        pointType = newPointType == null ? POINT_TYPE_EDEFAULT : newPointType;
        boolean oldPointTypeESet = pointTypeESet;
        pointTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ICCP_PROVIDED_POINT__POINT_TYPE, oldPointType, pointType, !oldPointTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPointType() {
        ICCPPointKind oldPointType = pointType;
        boolean oldPointTypeESet = pointTypeESet;
        pointType = POINT_TYPE_EDEFAULT;
        pointTypeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ICCP_PROVIDED_POINT__POINT_TYPE, oldPointType, POINT_TYPE_EDEFAULT, oldPointTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPointType() {
        return pointTypeESet;
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
                CimPackage.ICCP_PROVIDED_POINT__SCOPE, oldScope, scope, !oldScopeESet ) );
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
                CimPackage.ICCP_PROVIDED_POINT__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet ) );
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.ICCP_PROVIDED_POINT__ACCESS_PRIVILEDGE:
            return getAccessPriviledge();
        case CimPackage.ICCP_PROVIDED_POINT__POINT_QUALITY:
            return getPointQuality();
        case CimPackage.ICCP_PROVIDED_POINT__POINT_TYPE:
            return getPointType();
        case CimPackage.ICCP_PROVIDED_POINT__SCOPE:
            return getScope();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.ICCP_PROVIDED_POINT__ACCESS_PRIVILEDGE:
            setAccessPriviledge( ( ICCPAccessPrivilegeKind ) newValue );
            return;
        case CimPackage.ICCP_PROVIDED_POINT__POINT_QUALITY:
            setPointQuality( ( ICCPQualityKind ) newValue );
            return;
        case CimPackage.ICCP_PROVIDED_POINT__POINT_TYPE:
            setPointType( ( ICCPPointKind ) newValue );
            return;
        case CimPackage.ICCP_PROVIDED_POINT__SCOPE:
            setScope( ( ICCPScope ) newValue );
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
        case CimPackage.ICCP_PROVIDED_POINT__ACCESS_PRIVILEDGE:
            unsetAccessPriviledge();
            return;
        case CimPackage.ICCP_PROVIDED_POINT__POINT_QUALITY:
            unsetPointQuality();
            return;
        case CimPackage.ICCP_PROVIDED_POINT__POINT_TYPE:
            unsetPointType();
            return;
        case CimPackage.ICCP_PROVIDED_POINT__SCOPE:
            unsetScope();
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
        case CimPackage.ICCP_PROVIDED_POINT__ACCESS_PRIVILEDGE:
            return isSetAccessPriviledge();
        case CimPackage.ICCP_PROVIDED_POINT__POINT_QUALITY:
            return isSetPointQuality();
        case CimPackage.ICCP_PROVIDED_POINT__POINT_TYPE:
            return isSetPointType();
        case CimPackage.ICCP_PROVIDED_POINT__SCOPE:
            return isSetScope();
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
        result.append( " (accessPriviledge: " );
        if( accessPriviledgeESet )
            result.append( accessPriviledge );
        else
            result.append( "<unset>" );
        result.append( ", pointQuality: " );
        if( pointQualityESet )
            result.append( pointQuality );
        else
            result.append( "<unset>" );
        result.append( ", pointType: " );
        if( pointTypeESet )
            result.append( pointType );
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

} //ICCPProvidedPointImpl
