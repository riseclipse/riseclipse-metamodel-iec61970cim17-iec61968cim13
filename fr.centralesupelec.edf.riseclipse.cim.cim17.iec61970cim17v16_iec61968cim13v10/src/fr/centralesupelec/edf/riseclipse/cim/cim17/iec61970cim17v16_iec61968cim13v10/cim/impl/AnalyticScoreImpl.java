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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AggregateScore;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Analytic;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analytic Score</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalyticScoreImpl#getCalculationDateTime <em>Calculation Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalyticScoreImpl#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalyticScoreImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalyticScoreImpl#getAssetGroup <em>Asset Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalyticScoreImpl#getAssetAggregateScore <em>Asset Aggregate Score</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalyticScoreImpl#getAnalytic <em>Analytic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalyticScoreImpl#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalyticScoreImpl extends IdentifiedObjectImpl implements AnalyticScore {
    /**
     * The default value of the '{@link #getCalculationDateTime() <em>Calculation Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalculationDateTime()
     * @generated
     * @ordered
     */
    protected static final Date CALCULATION_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCalculationDateTime() <em>Calculation Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalculationDateTime()
     * @generated
     * @ordered
     */
    protected Date calculationDateTime = CALCULATION_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Calculation Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean calculationDateTimeESet;

    /**
     * The default value of the '{@link #getEffectiveDateTime() <em>Effective Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEffectiveDateTime()
     * @generated
     * @ordered
     */
    protected static final Date EFFECTIVE_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEffectiveDateTime() <em>Effective Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEffectiveDateTime()
     * @generated
     * @ordered
     */
    protected Date effectiveDateTime = EFFECTIVE_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Effective Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean effectiveDateTimeESet;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final Float VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected Float value = VALUE_EDEFAULT;

    /**
     * This is true if the Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valueESet;

    /**
     * The cached value of the '{@link #getAssetGroup() <em>Asset Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetGroup()
     * @generated
     * @ordered
     */
    protected AssetGroup assetGroup;

    /**
     * This is true if the Asset Group reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetGroupESet;

    /**
     * The cached value of the '{@link #getAssetAggregateScore() <em>Asset Aggregate Score</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetAggregateScore()
     * @generated
     * @ordered
     */
    protected AggregateScore assetAggregateScore;

    /**
     * This is true if the Asset Aggregate Score reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetAggregateScoreESet;

    /**
     * The cached value of the '{@link #getAnalytic() <em>Analytic</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalytic()
     * @generated
     * @ordered
     */
    protected Analytic analytic;

    /**
     * This is true if the Analytic reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean analyticESet;

    /**
     * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsset()
     * @generated
     * @ordered
     */
    protected Asset asset;

    /**
     * This is true if the Asset reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnalyticScoreImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAnalyticScore();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getCalculationDateTime() {
        return calculationDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCalculationDateTime( Date newCalculationDateTime ) {
        Date oldCalculationDateTime = calculationDateTime;
        calculationDateTime = newCalculationDateTime;
        boolean oldCalculationDateTimeESet = calculationDateTimeESet;
        calculationDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ANALYTIC_SCORE__CALCULATION_DATE_TIME,
                    oldCalculationDateTime, calculationDateTime, !oldCalculationDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCalculationDateTime() {
        Date oldCalculationDateTime = calculationDateTime;
        boolean oldCalculationDateTimeESet = calculationDateTimeESet;
        calculationDateTime = CALCULATION_DATE_TIME_EDEFAULT;
        calculationDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ANALYTIC_SCORE__CALCULATION_DATE_TIME,
                    oldCalculationDateTime, CALCULATION_DATE_TIME_EDEFAULT, oldCalculationDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCalculationDateTime() {
        return calculationDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEffectiveDateTime( Date newEffectiveDateTime ) {
        Date oldEffectiveDateTime = effectiveDateTime;
        effectiveDateTime = newEffectiveDateTime;
        boolean oldEffectiveDateTimeESet = effectiveDateTimeESet;
        effectiveDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ANALYTIC_SCORE__EFFECTIVE_DATE_TIME,
                    oldEffectiveDateTime, effectiveDateTime, !oldEffectiveDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEffectiveDateTime() {
        Date oldEffectiveDateTime = effectiveDateTime;
        boolean oldEffectiveDateTimeESet = effectiveDateTimeESet;
        effectiveDateTime = EFFECTIVE_DATE_TIME_EDEFAULT;
        effectiveDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ANALYTIC_SCORE__EFFECTIVE_DATE_TIME,
                    oldEffectiveDateTime, EFFECTIVE_DATE_TIME_EDEFAULT, oldEffectiveDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEffectiveDateTime() {
        return effectiveDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue( Float newValue ) {
        Float oldValue = value;
        value = newValue;
        boolean oldValueESet = valueESet;
        valueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ANALYTIC_SCORE__VALUE, oldValue, value, !oldValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValue() {
        Float oldValue = value;
        boolean oldValueESet = valueESet;
        value = VALUE_EDEFAULT;
        valueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ANALYTIC_SCORE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValue() {
        return valueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetGroup getAssetGroup() {
        return assetGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssetGroup( AssetGroup newAssetGroup, NotificationChain msgs ) {
        AssetGroup oldAssetGroup = assetGroup;
        assetGroup = newAssetGroup;
        boolean oldAssetGroupESet = assetGroupESet;
        assetGroupESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ANALYTIC_SCORE__ASSET_GROUP, oldAssetGroup, newAssetGroup, !oldAssetGroupESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAssetGroup( AssetGroup newAssetGroup ) {
        if( newAssetGroup != assetGroup ) {
            NotificationChain msgs = null;
            if( assetGroup != null ) msgs = ( ( InternalEObject ) assetGroup ).eInverseRemove( this,
                    CimPackage.ASSET_GROUP__ANALYTIC_SCORE, AssetGroup.class, msgs );
            if( newAssetGroup != null ) msgs = ( ( InternalEObject ) newAssetGroup ).eInverseAdd( this,
                    CimPackage.ASSET_GROUP__ANALYTIC_SCORE, AssetGroup.class, msgs );
            msgs = basicSetAssetGroup( newAssetGroup, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetGroupESet = assetGroupESet;
            assetGroupESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ANALYTIC_SCORE__ASSET_GROUP, newAssetGroup, newAssetGroup, !oldAssetGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAssetGroup( NotificationChain msgs ) {
        AssetGroup oldAssetGroup = assetGroup;
        assetGroup = null;
        boolean oldAssetGroupESet = assetGroupESet;
        assetGroupESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ANALYTIC_SCORE__ASSET_GROUP, oldAssetGroup, null, oldAssetGroupESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAssetGroup() {
        if( assetGroup != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) assetGroup ).eInverseRemove( this, CimPackage.ASSET_GROUP__ANALYTIC_SCORE,
                    AssetGroup.class, msgs );
            msgs = basicUnsetAssetGroup( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetGroupESet = assetGroupESet;
            assetGroupESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ANALYTIC_SCORE__ASSET_GROUP, null, null, oldAssetGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetGroup() {
        return assetGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AggregateScore getAssetAggregateScore() {
        return assetAggregateScore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssetAggregateScore( AggregateScore newAssetAggregateScore,
            NotificationChain msgs ) {
        AggregateScore oldAssetAggregateScore = assetAggregateScore;
        assetAggregateScore = newAssetAggregateScore;
        boolean oldAssetAggregateScoreESet = assetAggregateScoreESet;
        assetAggregateScoreESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ANALYTIC_SCORE__ASSET_AGGREGATE_SCORE, oldAssetAggregateScore, newAssetAggregateScore,
                    !oldAssetAggregateScoreESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAssetAggregateScore( AggregateScore newAssetAggregateScore ) {
        if( newAssetAggregateScore != assetAggregateScore ) {
            NotificationChain msgs = null;
            if( assetAggregateScore != null ) msgs = ( ( InternalEObject ) assetAggregateScore ).eInverseRemove( this,
                    CimPackage.AGGREGATE_SCORE__ANALYTIC_SCORE, AggregateScore.class, msgs );
            if( newAssetAggregateScore != null ) msgs = ( ( InternalEObject ) newAssetAggregateScore )
                    .eInverseAdd( this, CimPackage.AGGREGATE_SCORE__ANALYTIC_SCORE, AggregateScore.class, msgs );
            msgs = basicSetAssetAggregateScore( newAssetAggregateScore, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetAggregateScoreESet = assetAggregateScoreESet;
            assetAggregateScoreESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.ANALYTIC_SCORE__ASSET_AGGREGATE_SCORE,
                            newAssetAggregateScore, newAssetAggregateScore, !oldAssetAggregateScoreESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAssetAggregateScore( NotificationChain msgs ) {
        AggregateScore oldAssetAggregateScore = assetAggregateScore;
        assetAggregateScore = null;
        boolean oldAssetAggregateScoreESet = assetAggregateScoreESet;
        assetAggregateScoreESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ANALYTIC_SCORE__ASSET_AGGREGATE_SCORE, oldAssetAggregateScore, null,
                    oldAssetAggregateScoreESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAssetAggregateScore() {
        if( assetAggregateScore != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) assetAggregateScore ).eInverseRemove( this,
                    CimPackage.AGGREGATE_SCORE__ANALYTIC_SCORE, AggregateScore.class, msgs );
            msgs = basicUnsetAssetAggregateScore( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetAggregateScoreESet = assetAggregateScoreESet;
            assetAggregateScoreESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ANALYTIC_SCORE__ASSET_AGGREGATE_SCORE, null, null, oldAssetAggregateScoreESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetAggregateScore() {
        return assetAggregateScoreESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Analytic getAnalytic() {
        return analytic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAnalytic( Analytic newAnalytic, NotificationChain msgs ) {
        Analytic oldAnalytic = analytic;
        analytic = newAnalytic;
        boolean oldAnalyticESet = analyticESet;
        analyticESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ANALYTIC_SCORE__ANALYTIC, oldAnalytic, newAnalytic, !oldAnalyticESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAnalytic( Analytic newAnalytic ) {
        if( newAnalytic != analytic ) {
            NotificationChain msgs = null;
            if( analytic != null ) msgs = ( ( InternalEObject ) analytic ).eInverseRemove( this,
                    CimPackage.ANALYTIC__ANALYTIC_SCORE, Analytic.class, msgs );
            if( newAnalytic != null ) msgs = ( ( InternalEObject ) newAnalytic ).eInverseAdd( this,
                    CimPackage.ANALYTIC__ANALYTIC_SCORE, Analytic.class, msgs );
            msgs = basicSetAnalytic( newAnalytic, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAnalyticESet = analyticESet;
            analyticESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ANALYTIC_SCORE__ANALYTIC, newAnalytic, newAnalytic, !oldAnalyticESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAnalytic( NotificationChain msgs ) {
        Analytic oldAnalytic = analytic;
        analytic = null;
        boolean oldAnalyticESet = analyticESet;
        analyticESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ANALYTIC_SCORE__ANALYTIC, oldAnalytic, null, oldAnalyticESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAnalytic() {
        if( analytic != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) analytic ).eInverseRemove( this, CimPackage.ANALYTIC__ANALYTIC_SCORE,
                    Analytic.class, msgs );
            msgs = basicUnsetAnalytic( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAnalyticESet = analyticESet;
            analyticESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ANALYTIC_SCORE__ANALYTIC, null, null, oldAnalyticESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAnalytic() {
        return analyticESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Asset getAsset() {
        return asset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAsset( Asset newAsset, NotificationChain msgs ) {
        Asset oldAsset = asset;
        asset = newAsset;
        boolean oldAssetESet = assetESet;
        assetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ANALYTIC_SCORE__ASSET, oldAsset, newAsset, !oldAssetESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAsset( Asset newAsset ) {
        if( newAsset != asset ) {
            NotificationChain msgs = null;
            if( asset != null ) msgs = ( ( InternalEObject ) asset ).eInverseRemove( this,
                    CimPackage.ASSET__ANALYTIC_SCORE, Asset.class, msgs );
            if( newAsset != null ) msgs = ( ( InternalEObject ) newAsset ).eInverseAdd( this,
                    CimPackage.ASSET__ANALYTIC_SCORE, Asset.class, msgs );
            msgs = basicSetAsset( newAsset, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetESet = assetESet;
            assetESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ANALYTIC_SCORE__ASSET, newAsset, newAsset, !oldAssetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAsset( NotificationChain msgs ) {
        Asset oldAsset = asset;
        asset = null;
        boolean oldAssetESet = assetESet;
        assetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ANALYTIC_SCORE__ASSET, oldAsset, null, oldAssetESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAsset() {
        if( asset != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) asset ).eInverseRemove( this, CimPackage.ASSET__ANALYTIC_SCORE, Asset.class,
                    msgs );
            msgs = basicUnsetAsset( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetESet = assetESet;
            assetESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ANALYTIC_SCORE__ASSET, null, null, oldAssetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAsset() {
        return assetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ANALYTIC_SCORE__ASSET_GROUP:
            if( assetGroup != null ) msgs = ( ( InternalEObject ) assetGroup ).eInverseRemove( this,
                    CimPackage.ASSET_GROUP__ANALYTIC_SCORE, AssetGroup.class, msgs );
            return basicSetAssetGroup( ( AssetGroup ) otherEnd, msgs );
        case CimPackage.ANALYTIC_SCORE__ASSET_AGGREGATE_SCORE:
            if( assetAggregateScore != null ) msgs = ( ( InternalEObject ) assetAggregateScore ).eInverseRemove( this,
                    CimPackage.AGGREGATE_SCORE__ANALYTIC_SCORE, AggregateScore.class, msgs );
            return basicSetAssetAggregateScore( ( AggregateScore ) otherEnd, msgs );
        case CimPackage.ANALYTIC_SCORE__ANALYTIC:
            if( analytic != null ) msgs = ( ( InternalEObject ) analytic ).eInverseRemove( this,
                    CimPackage.ANALYTIC__ANALYTIC_SCORE, Analytic.class, msgs );
            return basicSetAnalytic( ( Analytic ) otherEnd, msgs );
        case CimPackage.ANALYTIC_SCORE__ASSET:
            if( asset != null ) msgs = ( ( InternalEObject ) asset ).eInverseRemove( this,
                    CimPackage.ASSET__ANALYTIC_SCORE, Asset.class, msgs );
            return basicSetAsset( ( Asset ) otherEnd, msgs );
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
        case CimPackage.ANALYTIC_SCORE__ASSET_GROUP:
            return basicUnsetAssetGroup( msgs );
        case CimPackage.ANALYTIC_SCORE__ASSET_AGGREGATE_SCORE:
            return basicUnsetAssetAggregateScore( msgs );
        case CimPackage.ANALYTIC_SCORE__ANALYTIC:
            return basicUnsetAnalytic( msgs );
        case CimPackage.ANALYTIC_SCORE__ASSET:
            return basicUnsetAsset( msgs );
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
        case CimPackage.ANALYTIC_SCORE__CALCULATION_DATE_TIME:
            return getCalculationDateTime();
        case CimPackage.ANALYTIC_SCORE__EFFECTIVE_DATE_TIME:
            return getEffectiveDateTime();
        case CimPackage.ANALYTIC_SCORE__VALUE:
            return getValue();
        case CimPackage.ANALYTIC_SCORE__ASSET_GROUP:
            return getAssetGroup();
        case CimPackage.ANALYTIC_SCORE__ASSET_AGGREGATE_SCORE:
            return getAssetAggregateScore();
        case CimPackage.ANALYTIC_SCORE__ANALYTIC:
            return getAnalytic();
        case CimPackage.ANALYTIC_SCORE__ASSET:
            return getAsset();
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
        case CimPackage.ANALYTIC_SCORE__CALCULATION_DATE_TIME:
            setCalculationDateTime( ( Date ) newValue );
            return;
        case CimPackage.ANALYTIC_SCORE__EFFECTIVE_DATE_TIME:
            setEffectiveDateTime( ( Date ) newValue );
            return;
        case CimPackage.ANALYTIC_SCORE__VALUE:
            setValue( ( Float ) newValue );
            return;
        case CimPackage.ANALYTIC_SCORE__ASSET_GROUP:
            setAssetGroup( ( AssetGroup ) newValue );
            return;
        case CimPackage.ANALYTIC_SCORE__ASSET_AGGREGATE_SCORE:
            setAssetAggregateScore( ( AggregateScore ) newValue );
            return;
        case CimPackage.ANALYTIC_SCORE__ANALYTIC:
            setAnalytic( ( Analytic ) newValue );
            return;
        case CimPackage.ANALYTIC_SCORE__ASSET:
            setAsset( ( Asset ) newValue );
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
        case CimPackage.ANALYTIC_SCORE__CALCULATION_DATE_TIME:
            unsetCalculationDateTime();
            return;
        case CimPackage.ANALYTIC_SCORE__EFFECTIVE_DATE_TIME:
            unsetEffectiveDateTime();
            return;
        case CimPackage.ANALYTIC_SCORE__VALUE:
            unsetValue();
            return;
        case CimPackage.ANALYTIC_SCORE__ASSET_GROUP:
            unsetAssetGroup();
            return;
        case CimPackage.ANALYTIC_SCORE__ASSET_AGGREGATE_SCORE:
            unsetAssetAggregateScore();
            return;
        case CimPackage.ANALYTIC_SCORE__ANALYTIC:
            unsetAnalytic();
            return;
        case CimPackage.ANALYTIC_SCORE__ASSET:
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
        case CimPackage.ANALYTIC_SCORE__CALCULATION_DATE_TIME:
            return isSetCalculationDateTime();
        case CimPackage.ANALYTIC_SCORE__EFFECTIVE_DATE_TIME:
            return isSetEffectiveDateTime();
        case CimPackage.ANALYTIC_SCORE__VALUE:
            return isSetValue();
        case CimPackage.ANALYTIC_SCORE__ASSET_GROUP:
            return isSetAssetGroup();
        case CimPackage.ANALYTIC_SCORE__ASSET_AGGREGATE_SCORE:
            return isSetAssetAggregateScore();
        case CimPackage.ANALYTIC_SCORE__ANALYTIC:
            return isSetAnalytic();
        case CimPackage.ANALYTIC_SCORE__ASSET:
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
        result.append( " (calculationDateTime: " );
        if( calculationDateTimeESet )
            result.append( calculationDateTime );
        else
            result.append( "<unset>" );
        result.append( ", effectiveDateTime: " );
        if( effectiveDateTimeESet )
            result.append( effectiveDateTime );
        else
            result.append( "<unset>" );
        result.append( ", value: " );
        if( valueESet )
            result.append( value );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AnalyticScoreImpl
