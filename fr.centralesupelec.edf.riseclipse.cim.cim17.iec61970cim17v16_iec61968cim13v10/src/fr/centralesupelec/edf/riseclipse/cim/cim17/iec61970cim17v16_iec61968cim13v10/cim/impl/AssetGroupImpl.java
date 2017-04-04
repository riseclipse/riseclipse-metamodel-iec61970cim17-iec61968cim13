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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Analytic;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetGroupKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetGroupImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetGroupImpl#getAnalyticScore <em>Analytic Score</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetGroupImpl#getAnalytic <em>Analytic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetGroupImpl#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetGroupImpl extends DocumentImpl implements AssetGroup {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final AssetGroupKind KIND_EDEFAULT = AssetGroupKind.ANALYSIS_GROUP;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected AssetGroupKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The cached value of the '{@link #getAnalyticScore() <em>Analytic Score</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalyticScore()
     * @generated
     * @ordered
     */
    protected EList< AnalyticScore > analyticScore;

    /**
     * The cached value of the '{@link #getAnalytic() <em>Analytic</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalytic()
     * @generated
     * @ordered
     */
    protected EList< Analytic > analytic;

    /**
     * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsset()
     * @generated
     * @ordered
     */
    protected EList< Asset > asset;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssetGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAssetGroup();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetGroupKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( AssetGroupKind newKind ) {
        AssetGroupKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET_GROUP__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        AssetGroupKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASSET_GROUP__KIND, oldKind, KIND_EDEFAULT, oldKindESet ) );
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
    public EList< AnalyticScore > getAnalyticScore() {
        if( analyticScore == null ) {
            analyticScore = new EObjectWithInverseResolvingEList.Unsettable< AnalyticScore >( AnalyticScore.class, this,
                    CimPackage.ASSET_GROUP__ANALYTIC_SCORE, CimPackage.ANALYTIC_SCORE__ASSET_GROUP );
        }
        return analyticScore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAnalyticScore() {
        if( analyticScore != null ) ( ( InternalEList.Unsettable< ? > ) analyticScore ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAnalyticScore() {
        return analyticScore != null && ( ( InternalEList.Unsettable< ? > ) analyticScore ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Analytic > getAnalytic() {
        if( analytic == null ) {
            analytic = new EObjectWithInverseEList.Unsettable.ManyInverse< Analytic >( Analytic.class, this,
                    CimPackage.ASSET_GROUP__ANALYTIC, CimPackage.ANALYTIC__ASSET_GROUP );
        }
        return analytic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAnalytic() {
        if( analytic != null ) ( ( InternalEList.Unsettable< ? > ) analytic ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAnalytic() {
        return analytic != null && ( ( InternalEList.Unsettable< ? > ) analytic ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Asset > getAsset() {
        if( asset == null ) {
            asset = new EObjectWithInverseEList.Unsettable.ManyInverse< Asset >( Asset.class, this,
                    CimPackage.ASSET_GROUP__ASSET, CimPackage.ASSET__ASSET_GROUP );
        }
        return asset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAsset() {
        if( asset != null ) ( ( InternalEList.Unsettable< ? > ) asset ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAsset() {
        return asset != null && ( ( InternalEList.Unsettable< ? > ) asset ).isSet();
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
        case CimPackage.ASSET_GROUP__ANALYTIC_SCORE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAnalyticScore() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ASSET_GROUP__ANALYTIC:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAnalytic() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ASSET_GROUP__ASSET:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAsset() ).basicAdd( otherEnd,
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
        case CimPackage.ASSET_GROUP__ANALYTIC_SCORE:
            return ( ( InternalEList< ? > ) getAnalyticScore() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET_GROUP__ANALYTIC:
            return ( ( InternalEList< ? > ) getAnalytic() ).basicRemove( otherEnd, msgs );
        case CimPackage.ASSET_GROUP__ASSET:
            return ( ( InternalEList< ? > ) getAsset() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.ASSET_GROUP__KIND:
            return getKind();
        case CimPackage.ASSET_GROUP__ANALYTIC_SCORE:
            return getAnalyticScore();
        case CimPackage.ASSET_GROUP__ANALYTIC:
            return getAnalytic();
        case CimPackage.ASSET_GROUP__ASSET:
            return getAsset();
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
        case CimPackage.ASSET_GROUP__KIND:
            setKind( ( AssetGroupKind ) newValue );
            return;
        case CimPackage.ASSET_GROUP__ANALYTIC_SCORE:
            getAnalyticScore().clear();
            getAnalyticScore().addAll( ( Collection< ? extends AnalyticScore > ) newValue );
            return;
        case CimPackage.ASSET_GROUP__ANALYTIC:
            getAnalytic().clear();
            getAnalytic().addAll( ( Collection< ? extends Analytic > ) newValue );
            return;
        case CimPackage.ASSET_GROUP__ASSET:
            getAsset().clear();
            getAsset().addAll( ( Collection< ? extends Asset > ) newValue );
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
        case CimPackage.ASSET_GROUP__KIND:
            unsetKind();
            return;
        case CimPackage.ASSET_GROUP__ANALYTIC_SCORE:
            unsetAnalyticScore();
            return;
        case CimPackage.ASSET_GROUP__ANALYTIC:
            unsetAnalytic();
            return;
        case CimPackage.ASSET_GROUP__ASSET:
            unsetAsset();
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
        case CimPackage.ASSET_GROUP__KIND:
            return isSetKind();
        case CimPackage.ASSET_GROUP__ANALYTIC_SCORE:
            return isSetAnalyticScore();
        case CimPackage.ASSET_GROUP__ANALYTIC:
            return isSetAnalytic();
        case CimPackage.ASSET_GROUP__ASSET:
            return isSetAsset();
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
        result.append( " (kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AssetGroupImpl
