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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Health Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetHealthEventImpl#getActionRecommendation <em>Action Recommendation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetHealthEventImpl#getActionTimeline <em>Action Timeline</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetHealthEventImpl#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetHealthEventImpl#getAnalytic <em>Analytic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetHealthEventImpl extends ActivityRecordImpl implements AssetHealthEvent {
    /**
     * The default value of the '{@link #getActionRecommendation() <em>Action Recommendation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActionRecommendation()
     * @generated
     * @ordered
     */
    protected static final String ACTION_RECOMMENDATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getActionRecommendation() <em>Action Recommendation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActionRecommendation()
     * @generated
     * @ordered
     */
    protected String actionRecommendation = ACTION_RECOMMENDATION_EDEFAULT;

    /**
     * This is true if the Action Recommendation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean actionRecommendationESet;

    /**
     * The default value of the '{@link #getActionTimeline() <em>Action Timeline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActionTimeline()
     * @generated
     * @ordered
     */
    protected static final String ACTION_TIMELINE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getActionTimeline() <em>Action Timeline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActionTimeline()
     * @generated
     * @ordered
     */
    protected String actionTimeline = ACTION_TIMELINE_EDEFAULT;

    /**
     * This is true if the Action Timeline attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean actionTimelineESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssetHealthEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAssetHealthEvent();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getActionRecommendation() {
        return actionRecommendation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setActionRecommendation( String newActionRecommendation ) {
        String oldActionRecommendation = actionRecommendation;
        actionRecommendation = newActionRecommendation;
        boolean oldActionRecommendationESet = actionRecommendationESet;
        actionRecommendationESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ASSET_HEALTH_EVENT__ACTION_RECOMMENDATION,
                        oldActionRecommendation, actionRecommendation, !oldActionRecommendationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetActionRecommendation() {
        String oldActionRecommendation = actionRecommendation;
        boolean oldActionRecommendationESet = actionRecommendationESet;
        actionRecommendation = ACTION_RECOMMENDATION_EDEFAULT;
        actionRecommendationESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET_HEALTH_EVENT__ACTION_RECOMMENDATION,
                        oldActionRecommendation, ACTION_RECOMMENDATION_EDEFAULT, oldActionRecommendationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetActionRecommendation() {
        return actionRecommendationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getActionTimeline() {
        return actionTimeline;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setActionTimeline( String newActionTimeline ) {
        String oldActionTimeline = actionTimeline;
        actionTimeline = newActionTimeline;
        boolean oldActionTimelineESet = actionTimelineESet;
        actionTimelineESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET_HEALTH_EVENT__ACTION_TIMELINE,
                    oldActionTimeline, actionTimeline, !oldActionTimelineESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetActionTimeline() {
        String oldActionTimeline = actionTimeline;
        boolean oldActionTimelineESet = actionTimelineESet;
        actionTimeline = ACTION_TIMELINE_EDEFAULT;
        actionTimelineESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET_HEALTH_EVENT__ACTION_TIMELINE,
                    oldActionTimeline, ACTION_TIMELINE_EDEFAULT, oldActionTimelineESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetActionTimeline() {
        return actionTimelineESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET_HEALTH_EVENT__EFFECTIVE_DATE_TIME,
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET_HEALTH_EVENT__EFFECTIVE_DATE_TIME,
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
                    CimPackage.ASSET_HEALTH_EVENT__ANALYTIC, oldAnalytic, newAnalytic, !oldAnalyticESet );
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
                    CimPackage.ANALYTIC__ASSET_HEALTH_EVENT, Analytic.class, msgs );
            if( newAnalytic != null ) msgs = ( ( InternalEObject ) newAnalytic ).eInverseAdd( this,
                    CimPackage.ANALYTIC__ASSET_HEALTH_EVENT, Analytic.class, msgs );
            msgs = basicSetAnalytic( newAnalytic, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAnalyticESet = analyticESet;
            analyticESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET_HEALTH_EVENT__ANALYTIC, newAnalytic, newAnalytic, !oldAnalyticESet ) );
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
                    CimPackage.ASSET_HEALTH_EVENT__ANALYTIC, oldAnalytic, null, oldAnalyticESet );
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
            msgs = ( ( InternalEObject ) analytic ).eInverseRemove( this, CimPackage.ANALYTIC__ASSET_HEALTH_EVENT,
                    Analytic.class, msgs );
            msgs = basicUnsetAnalytic( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAnalyticESet = analyticESet;
            analyticESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_HEALTH_EVENT__ANALYTIC, null, null, oldAnalyticESet ) );
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ASSET_HEALTH_EVENT__ANALYTIC:
            if( analytic != null ) msgs = ( ( InternalEObject ) analytic ).eInverseRemove( this,
                    CimPackage.ANALYTIC__ASSET_HEALTH_EVENT, Analytic.class, msgs );
            return basicSetAnalytic( ( Analytic ) otherEnd, msgs );
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
        case CimPackage.ASSET_HEALTH_EVENT__ANALYTIC:
            return basicUnsetAnalytic( msgs );
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
        case CimPackage.ASSET_HEALTH_EVENT__ACTION_RECOMMENDATION:
            return getActionRecommendation();
        case CimPackage.ASSET_HEALTH_EVENT__ACTION_TIMELINE:
            return getActionTimeline();
        case CimPackage.ASSET_HEALTH_EVENT__EFFECTIVE_DATE_TIME:
            return getEffectiveDateTime();
        case CimPackage.ASSET_HEALTH_EVENT__ANALYTIC:
            return getAnalytic();
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
        case CimPackage.ASSET_HEALTH_EVENT__ACTION_RECOMMENDATION:
            setActionRecommendation( ( String ) newValue );
            return;
        case CimPackage.ASSET_HEALTH_EVENT__ACTION_TIMELINE:
            setActionTimeline( ( String ) newValue );
            return;
        case CimPackage.ASSET_HEALTH_EVENT__EFFECTIVE_DATE_TIME:
            setEffectiveDateTime( ( Date ) newValue );
            return;
        case CimPackage.ASSET_HEALTH_EVENT__ANALYTIC:
            setAnalytic( ( Analytic ) newValue );
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
        case CimPackage.ASSET_HEALTH_EVENT__ACTION_RECOMMENDATION:
            unsetActionRecommendation();
            return;
        case CimPackage.ASSET_HEALTH_EVENT__ACTION_TIMELINE:
            unsetActionTimeline();
            return;
        case CimPackage.ASSET_HEALTH_EVENT__EFFECTIVE_DATE_TIME:
            unsetEffectiveDateTime();
            return;
        case CimPackage.ASSET_HEALTH_EVENT__ANALYTIC:
            unsetAnalytic();
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
        case CimPackage.ASSET_HEALTH_EVENT__ACTION_RECOMMENDATION:
            return isSetActionRecommendation();
        case CimPackage.ASSET_HEALTH_EVENT__ACTION_TIMELINE:
            return isSetActionTimeline();
        case CimPackage.ASSET_HEALTH_EVENT__EFFECTIVE_DATE_TIME:
            return isSetEffectiveDateTime();
        case CimPackage.ASSET_HEALTH_EVENT__ANALYTIC:
            return isSetAnalytic();
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
        result.append( " (actionRecommendation: " );
        if( actionRecommendationESet )
            result.append( actionRecommendation );
        else
            result.append( "<unset>" );
        result.append( ", actionTimeline: " );
        if( actionTimelineESet )
            result.append( actionTimeline );
        else
            result.append( "<unset>" );
        result.append( ", effectiveDateTime: " );
        if( effectiveDateTimeESet )
            result.append( effectiveDateTime );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AssetHealthEventImpl
