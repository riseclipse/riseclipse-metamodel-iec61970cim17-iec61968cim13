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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HealthScore;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RiskScore;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Score</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HealthScoreImpl#getAssetRiskScore <em>Asset Risk Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthScoreImpl extends AggregateScoreImpl implements HealthScore {
    /**
     * The cached value of the '{@link #getAssetRiskScore() <em>Asset Risk Score</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetRiskScore()
     * @generated
     * @ordered
     */
    protected RiskScore assetRiskScore;

    /**
     * This is true if the Asset Risk Score reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetRiskScoreESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HealthScoreImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getHealthScore();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RiskScore getAssetRiskScore() {
        return assetRiskScore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssetRiskScore( RiskScore newAssetRiskScore, NotificationChain msgs ) {
        RiskScore oldAssetRiskScore = assetRiskScore;
        assetRiskScore = newAssetRiskScore;
        boolean oldAssetRiskScoreESet = assetRiskScoreESet;
        assetRiskScoreESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.HEALTH_SCORE__ASSET_RISK_SCORE, oldAssetRiskScore, newAssetRiskScore,
                    !oldAssetRiskScoreESet );
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
    public void setAssetRiskScore( RiskScore newAssetRiskScore ) {
        if( newAssetRiskScore != assetRiskScore ) {
            NotificationChain msgs = null;
            if( assetRiskScore != null ) msgs = ( ( InternalEObject ) assetRiskScore ).eInverseRemove( this,
                    CimPackage.RISK_SCORE__ASSET_HEALTH_SCORE, RiskScore.class, msgs );
            if( newAssetRiskScore != null ) msgs = ( ( InternalEObject ) newAssetRiskScore ).eInverseAdd( this,
                    CimPackage.RISK_SCORE__ASSET_HEALTH_SCORE, RiskScore.class, msgs );
            msgs = basicSetAssetRiskScore( newAssetRiskScore, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetRiskScoreESet = assetRiskScoreESet;
            assetRiskScoreESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HEALTH_SCORE__ASSET_RISK_SCORE,
                        newAssetRiskScore, newAssetRiskScore, !oldAssetRiskScoreESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAssetRiskScore( NotificationChain msgs ) {
        RiskScore oldAssetRiskScore = assetRiskScore;
        assetRiskScore = null;
        boolean oldAssetRiskScoreESet = assetRiskScoreESet;
        assetRiskScoreESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HEALTH_SCORE__ASSET_RISK_SCORE, oldAssetRiskScore, null, oldAssetRiskScoreESet );
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
    public void unsetAssetRiskScore() {
        if( assetRiskScore != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) assetRiskScore ).eInverseRemove( this,
                    CimPackage.RISK_SCORE__ASSET_HEALTH_SCORE, RiskScore.class, msgs );
            msgs = basicUnsetAssetRiskScore( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetRiskScoreESet = assetRiskScoreESet;
            assetRiskScoreESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HEALTH_SCORE__ASSET_RISK_SCORE, null, null, oldAssetRiskScoreESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetRiskScore() {
        return assetRiskScoreESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.HEALTH_SCORE__ASSET_RISK_SCORE:
            if( assetRiskScore != null ) msgs = ( ( InternalEObject ) assetRiskScore ).eInverseRemove( this,
                    CimPackage.RISK_SCORE__ASSET_HEALTH_SCORE, RiskScore.class, msgs );
            return basicSetAssetRiskScore( ( RiskScore ) otherEnd, msgs );
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
        case CimPackage.HEALTH_SCORE__ASSET_RISK_SCORE:
            return basicUnsetAssetRiskScore( msgs );
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
        case CimPackage.HEALTH_SCORE__ASSET_RISK_SCORE:
            return getAssetRiskScore();
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
        case CimPackage.HEALTH_SCORE__ASSET_RISK_SCORE:
            setAssetRiskScore( ( RiskScore ) newValue );
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
        case CimPackage.HEALTH_SCORE__ASSET_RISK_SCORE:
            unsetAssetRiskScore();
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
        case CimPackage.HEALTH_SCORE__ASSET_RISK_SCORE:
            return isSetAssetRiskScore();
        }
        return super.eIsSet( featureID );
    }

} //HealthScoreImpl
