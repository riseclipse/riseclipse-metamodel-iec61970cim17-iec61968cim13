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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Analytic;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScaleKind;

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
 * An implementation of the model object '<em><b>Analytic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalyticImpl#getBestValue <em>Best Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalyticImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalyticImpl#getScaleKind <em>Scale Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalyticImpl#getWorstValue <em>Worst Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalyticImpl#getAnalyticScore <em>Analytic Score</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalyticImpl#getAssetHealthEvent <em>Asset Health Event</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalyticImpl#getAssetGroup <em>Asset Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalyticImpl#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalyticImpl extends DocumentImpl implements Analytic {
    /**
     * The default value of the '{@link #getBestValue() <em>Best Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBestValue()
     * @generated
     * @ordered
     */
    protected static final Float BEST_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBestValue() <em>Best Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBestValue()
     * @generated
     * @ordered
     */
    protected Float bestValue = BEST_VALUE_EDEFAULT;

    /**
     * This is true if the Best Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bestValueESet;

    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final AnalyticKind KIND_EDEFAULT = AnalyticKind.RISK_ANALYTIC;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected AnalyticKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The default value of the '{@link #getScaleKind() <em>Scale Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScaleKind()
     * @generated
     * @ordered
     */
    protected static final ScaleKind SCALE_KIND_EDEFAULT = ScaleKind.LINEAR;

    /**
     * The cached value of the '{@link #getScaleKind() <em>Scale Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScaleKind()
     * @generated
     * @ordered
     */
    protected ScaleKind scaleKind = SCALE_KIND_EDEFAULT;

    /**
     * This is true if the Scale Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean scaleKindESet;

    /**
     * The default value of the '{@link #getWorstValue() <em>Worst Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorstValue()
     * @generated
     * @ordered
     */
    protected static final Float WORST_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWorstValue() <em>Worst Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorstValue()
     * @generated
     * @ordered
     */
    protected Float worstValue = WORST_VALUE_EDEFAULT;

    /**
     * This is true if the Worst Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean worstValueESet;

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
     * The cached value of the '{@link #getAssetHealthEvent() <em>Asset Health Event</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetHealthEvent()
     * @generated
     * @ordered
     */
    protected EList< AssetHealthEvent > assetHealthEvent;

    /**
     * The cached value of the '{@link #getAssetGroup() <em>Asset Group</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetGroup()
     * @generated
     * @ordered
     */
    protected EList< AssetGroup > assetGroup;

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
    protected AnalyticImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAnalytic();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBestValue() {
        return bestValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBestValue( Float newBestValue ) {
        Float oldBestValue = bestValue;
        bestValue = newBestValue;
        boolean oldBestValueESet = bestValueESet;
        bestValueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ANALYTIC__BEST_VALUE, oldBestValue, bestValue, !oldBestValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBestValue() {
        Float oldBestValue = bestValue;
        boolean oldBestValueESet = bestValueESet;
        bestValue = BEST_VALUE_EDEFAULT;
        bestValueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ANALYTIC__BEST_VALUE, oldBestValue, BEST_VALUE_EDEFAULT, oldBestValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBestValue() {
        return bestValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnalyticKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( AnalyticKind newKind ) {
        AnalyticKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ANALYTIC__KIND,
                oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        AnalyticKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ANALYTIC__KIND, oldKind, KIND_EDEFAULT, oldKindESet ) );
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
    public ScaleKind getScaleKind() {
        return scaleKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setScaleKind( ScaleKind newScaleKind ) {
        ScaleKind oldScaleKind = scaleKind;
        scaleKind = newScaleKind == null ? SCALE_KIND_EDEFAULT : newScaleKind;
        boolean oldScaleKindESet = scaleKindESet;
        scaleKindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ANALYTIC__SCALE_KIND, oldScaleKind, scaleKind, !oldScaleKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetScaleKind() {
        ScaleKind oldScaleKind = scaleKind;
        boolean oldScaleKindESet = scaleKindESet;
        scaleKind = SCALE_KIND_EDEFAULT;
        scaleKindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ANALYTIC__SCALE_KIND, oldScaleKind, SCALE_KIND_EDEFAULT, oldScaleKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetScaleKind() {
        return scaleKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getWorstValue() {
        return worstValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWorstValue( Float newWorstValue ) {
        Float oldWorstValue = worstValue;
        worstValue = newWorstValue;
        boolean oldWorstValueESet = worstValueESet;
        worstValueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ANALYTIC__WORST_VALUE, oldWorstValue, worstValue, !oldWorstValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWorstValue() {
        Float oldWorstValue = worstValue;
        boolean oldWorstValueESet = worstValueESet;
        worstValue = WORST_VALUE_EDEFAULT;
        worstValueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ANALYTIC__WORST_VALUE, oldWorstValue, WORST_VALUE_EDEFAULT, oldWorstValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWorstValue() {
        return worstValueESet;
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
                    CimPackage.ANALYTIC__ANALYTIC_SCORE, CimPackage.ANALYTIC_SCORE__ANALYTIC );
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
    public EList< AssetHealthEvent > getAssetHealthEvent() {
        if( assetHealthEvent == null ) {
            assetHealthEvent = new EObjectWithInverseResolvingEList.Unsettable< AssetHealthEvent >(
                    AssetHealthEvent.class, this, CimPackage.ANALYTIC__ASSET_HEALTH_EVENT,
                    CimPackage.ASSET_HEALTH_EVENT__ANALYTIC );
        }
        return assetHealthEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAssetHealthEvent() {
        if( assetHealthEvent != null ) ( ( InternalEList.Unsettable< ? > ) assetHealthEvent ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetHealthEvent() {
        return assetHealthEvent != null && ( ( InternalEList.Unsettable< ? > ) assetHealthEvent ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AssetGroup > getAssetGroup() {
        if( assetGroup == null ) {
            assetGroup = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< AssetGroup >( AssetGroup.class,
                    this, CimPackage.ANALYTIC__ASSET_GROUP, CimPackage.ASSET_GROUP__ANALYTIC );
        }
        return assetGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAssetGroup() {
        if( assetGroup != null ) ( ( InternalEList.Unsettable< ? > ) assetGroup ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetGroup() {
        return assetGroup != null && ( ( InternalEList.Unsettable< ? > ) assetGroup ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Asset > getAsset() {
        if( asset == null ) {
            asset = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Asset >( Asset.class, this,
                    CimPackage.ANALYTIC__ASSET, CimPackage.ASSET__ANALYTIC );
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
        case CimPackage.ANALYTIC__ANALYTIC_SCORE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAnalyticScore() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ANALYTIC__ASSET_HEALTH_EVENT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAssetHealthEvent() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ANALYTIC__ASSET_GROUP:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAssetGroup() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ANALYTIC__ASSET:
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
        case CimPackage.ANALYTIC__ANALYTIC_SCORE:
            return ( ( InternalEList< ? > ) getAnalyticScore() ).basicRemove( otherEnd, msgs );
        case CimPackage.ANALYTIC__ASSET_HEALTH_EVENT:
            return ( ( InternalEList< ? > ) getAssetHealthEvent() ).basicRemove( otherEnd, msgs );
        case CimPackage.ANALYTIC__ASSET_GROUP:
            return ( ( InternalEList< ? > ) getAssetGroup() ).basicRemove( otherEnd, msgs );
        case CimPackage.ANALYTIC__ASSET:
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
        case CimPackage.ANALYTIC__BEST_VALUE:
            return getBestValue();
        case CimPackage.ANALYTIC__KIND:
            return getKind();
        case CimPackage.ANALYTIC__SCALE_KIND:
            return getScaleKind();
        case CimPackage.ANALYTIC__WORST_VALUE:
            return getWorstValue();
        case CimPackage.ANALYTIC__ANALYTIC_SCORE:
            return getAnalyticScore();
        case CimPackage.ANALYTIC__ASSET_HEALTH_EVENT:
            return getAssetHealthEvent();
        case CimPackage.ANALYTIC__ASSET_GROUP:
            return getAssetGroup();
        case CimPackage.ANALYTIC__ASSET:
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
        case CimPackage.ANALYTIC__BEST_VALUE:
            setBestValue( ( Float ) newValue );
            return;
        case CimPackage.ANALYTIC__KIND:
            setKind( ( AnalyticKind ) newValue );
            return;
        case CimPackage.ANALYTIC__SCALE_KIND:
            setScaleKind( ( ScaleKind ) newValue );
            return;
        case CimPackage.ANALYTIC__WORST_VALUE:
            setWorstValue( ( Float ) newValue );
            return;
        case CimPackage.ANALYTIC__ANALYTIC_SCORE:
            getAnalyticScore().clear();
            getAnalyticScore().addAll( ( Collection< ? extends AnalyticScore > ) newValue );
            return;
        case CimPackage.ANALYTIC__ASSET_HEALTH_EVENT:
            getAssetHealthEvent().clear();
            getAssetHealthEvent().addAll( ( Collection< ? extends AssetHealthEvent > ) newValue );
            return;
        case CimPackage.ANALYTIC__ASSET_GROUP:
            getAssetGroup().clear();
            getAssetGroup().addAll( ( Collection< ? extends AssetGroup > ) newValue );
            return;
        case CimPackage.ANALYTIC__ASSET:
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
        case CimPackage.ANALYTIC__BEST_VALUE:
            unsetBestValue();
            return;
        case CimPackage.ANALYTIC__KIND:
            unsetKind();
            return;
        case CimPackage.ANALYTIC__SCALE_KIND:
            unsetScaleKind();
            return;
        case CimPackage.ANALYTIC__WORST_VALUE:
            unsetWorstValue();
            return;
        case CimPackage.ANALYTIC__ANALYTIC_SCORE:
            unsetAnalyticScore();
            return;
        case CimPackage.ANALYTIC__ASSET_HEALTH_EVENT:
            unsetAssetHealthEvent();
            return;
        case CimPackage.ANALYTIC__ASSET_GROUP:
            unsetAssetGroup();
            return;
        case CimPackage.ANALYTIC__ASSET:
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
        case CimPackage.ANALYTIC__BEST_VALUE:
            return isSetBestValue();
        case CimPackage.ANALYTIC__KIND:
            return isSetKind();
        case CimPackage.ANALYTIC__SCALE_KIND:
            return isSetScaleKind();
        case CimPackage.ANALYTIC__WORST_VALUE:
            return isSetWorstValue();
        case CimPackage.ANALYTIC__ANALYTIC_SCORE:
            return isSetAnalyticScore();
        case CimPackage.ANALYTIC__ASSET_HEALTH_EVENT:
            return isSetAssetHealthEvent();
        case CimPackage.ANALYTIC__ASSET_GROUP:
            return isSetAssetGroup();
        case CimPackage.ANALYTIC__ASSET:
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

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (bestValue: " );
        if( bestValueESet )
            result.append( bestValue );
        else
            result.append( "<unset>" );
        result.append( ", kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ", scaleKind: " );
        if( scaleKindESet )
            result.append( scaleKind );
        else
            result.append( "<unset>" );
        result.append( ", worstValue: " );
        if( worstValueESet )
            result.append( worstValue );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AnalyticImpl
