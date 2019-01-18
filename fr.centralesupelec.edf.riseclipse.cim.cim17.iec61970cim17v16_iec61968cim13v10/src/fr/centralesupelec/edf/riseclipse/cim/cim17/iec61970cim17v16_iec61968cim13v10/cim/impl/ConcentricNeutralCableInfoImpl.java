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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concentric Neutral Cable Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConcentricNeutralCableInfoImpl#getDiameterOverNeutral <em>Diameter Over Neutral</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConcentricNeutralCableInfoImpl#getNeutralStrandCount <em>Neutral Strand Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConcentricNeutralCableInfoImpl#getNeutralStrandGmr <em>Neutral Strand Gmr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConcentricNeutralCableInfoImpl#getNeutralStrandRadius <em>Neutral Strand Radius</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConcentricNeutralCableInfoImpl#getNeutralStrandRDC20 <em>Neutral Strand RDC20</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcentricNeutralCableInfoImpl extends CableInfoImpl implements ConcentricNeutralCableInfo {
    /**
     * The default value of the '{@link #getDiameterOverNeutral() <em>Diameter Over Neutral</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiameterOverNeutral()
     * @generated
     * @ordered
     */
    protected static final Float DIAMETER_OVER_NEUTRAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDiameterOverNeutral() <em>Diameter Over Neutral</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiameterOverNeutral()
     * @generated
     * @ordered
     */
    protected Float diameterOverNeutral = DIAMETER_OVER_NEUTRAL_EDEFAULT;

    /**
     * This is true if the Diameter Over Neutral attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean diameterOverNeutralESet;

    /**
     * The default value of the '{@link #getNeutralStrandCount() <em>Neutral Strand Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeutralStrandCount()
     * @generated
     * @ordered
     */
    protected static final Integer NEUTRAL_STRAND_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNeutralStrandCount() <em>Neutral Strand Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeutralStrandCount()
     * @generated
     * @ordered
     */
    protected Integer neutralStrandCount = NEUTRAL_STRAND_COUNT_EDEFAULT;

    /**
     * This is true if the Neutral Strand Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean neutralStrandCountESet;

    /**
     * The default value of the '{@link #getNeutralStrandGmr() <em>Neutral Strand Gmr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeutralStrandGmr()
     * @generated
     * @ordered
     */
    protected static final Float NEUTRAL_STRAND_GMR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNeutralStrandGmr() <em>Neutral Strand Gmr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeutralStrandGmr()
     * @generated
     * @ordered
     */
    protected Float neutralStrandGmr = NEUTRAL_STRAND_GMR_EDEFAULT;

    /**
     * This is true if the Neutral Strand Gmr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean neutralStrandGmrESet;

    /**
     * The default value of the '{@link #getNeutralStrandRadius() <em>Neutral Strand Radius</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeutralStrandRadius()
     * @generated
     * @ordered
     */
    protected static final Float NEUTRAL_STRAND_RADIUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNeutralStrandRadius() <em>Neutral Strand Radius</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeutralStrandRadius()
     * @generated
     * @ordered
     */
    protected Float neutralStrandRadius = NEUTRAL_STRAND_RADIUS_EDEFAULT;

    /**
     * This is true if the Neutral Strand Radius attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean neutralStrandRadiusESet;

    /**
     * The default value of the '{@link #getNeutralStrandRDC20() <em>Neutral Strand RDC20</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeutralStrandRDC20()
     * @generated
     * @ordered
     */
    protected static final Float NEUTRAL_STRAND_RDC20_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNeutralStrandRDC20() <em>Neutral Strand RDC20</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeutralStrandRDC20()
     * @generated
     * @ordered
     */
    protected Float neutralStrandRDC20 = NEUTRAL_STRAND_RDC20_EDEFAULT;

    /**
     * This is true if the Neutral Strand RDC20 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean neutralStrandRDC20ESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConcentricNeutralCableInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getConcentricNeutralCableInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDiameterOverNeutral() {
        return diameterOverNeutral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDiameterOverNeutral( Float newDiameterOverNeutral ) {
        Float oldDiameterOverNeutral = diameterOverNeutral;
        diameterOverNeutral = newDiameterOverNeutral;
        boolean oldDiameterOverNeutralESet = diameterOverNeutralESet;
        diameterOverNeutralESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL, oldDiameterOverNeutral,
                diameterOverNeutral, !oldDiameterOverNeutralESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiameterOverNeutral() {
        Float oldDiameterOverNeutral = diameterOverNeutral;
        boolean oldDiameterOverNeutralESet = diameterOverNeutralESet;
        diameterOverNeutral = DIAMETER_OVER_NEUTRAL_EDEFAULT;
        diameterOverNeutralESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL, oldDiameterOverNeutral,
                DIAMETER_OVER_NEUTRAL_EDEFAULT, oldDiameterOverNeutralESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiameterOverNeutral() {
        return diameterOverNeutralESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getNeutralStrandCount() {
        return neutralStrandCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNeutralStrandCount( Integer newNeutralStrandCount ) {
        Integer oldNeutralStrandCount = neutralStrandCount;
        neutralStrandCount = newNeutralStrandCount;
        boolean oldNeutralStrandCountESet = neutralStrandCountESet;
        neutralStrandCountESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT, oldNeutralStrandCount,
                neutralStrandCount, !oldNeutralStrandCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNeutralStrandCount() {
        Integer oldNeutralStrandCount = neutralStrandCount;
        boolean oldNeutralStrandCountESet = neutralStrandCountESet;
        neutralStrandCount = NEUTRAL_STRAND_COUNT_EDEFAULT;
        neutralStrandCountESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT, oldNeutralStrandCount,
                NEUTRAL_STRAND_COUNT_EDEFAULT, oldNeutralStrandCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNeutralStrandCount() {
        return neutralStrandCountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNeutralStrandGmr() {
        return neutralStrandGmr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNeutralStrandGmr( Float newNeutralStrandGmr ) {
        Float oldNeutralStrandGmr = neutralStrandGmr;
        neutralStrandGmr = newNeutralStrandGmr;
        boolean oldNeutralStrandGmrESet = neutralStrandGmrESet;
        neutralStrandGmrESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_GMR, oldNeutralStrandGmr, neutralStrandGmr,
                !oldNeutralStrandGmrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNeutralStrandGmr() {
        Float oldNeutralStrandGmr = neutralStrandGmr;
        boolean oldNeutralStrandGmrESet = neutralStrandGmrESet;
        neutralStrandGmr = NEUTRAL_STRAND_GMR_EDEFAULT;
        neutralStrandGmrESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_GMR, oldNeutralStrandGmr,
                NEUTRAL_STRAND_GMR_EDEFAULT, oldNeutralStrandGmrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNeutralStrandGmr() {
        return neutralStrandGmrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNeutralStrandRadius() {
        return neutralStrandRadius;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNeutralStrandRadius( Float newNeutralStrandRadius ) {
        Float oldNeutralStrandRadius = neutralStrandRadius;
        neutralStrandRadius = newNeutralStrandRadius;
        boolean oldNeutralStrandRadiusESet = neutralStrandRadiusESet;
        neutralStrandRadiusESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_RADIUS, oldNeutralStrandRadius,
                neutralStrandRadius, !oldNeutralStrandRadiusESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNeutralStrandRadius() {
        Float oldNeutralStrandRadius = neutralStrandRadius;
        boolean oldNeutralStrandRadiusESet = neutralStrandRadiusESet;
        neutralStrandRadius = NEUTRAL_STRAND_RADIUS_EDEFAULT;
        neutralStrandRadiusESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_RADIUS, oldNeutralStrandRadius,
                NEUTRAL_STRAND_RADIUS_EDEFAULT, oldNeutralStrandRadiusESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNeutralStrandRadius() {
        return neutralStrandRadiusESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNeutralStrandRDC20() {
        return neutralStrandRDC20;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNeutralStrandRDC20( Float newNeutralStrandRDC20 ) {
        Float oldNeutralStrandRDC20 = neutralStrandRDC20;
        neutralStrandRDC20 = newNeutralStrandRDC20;
        boolean oldNeutralStrandRDC20ESet = neutralStrandRDC20ESet;
        neutralStrandRDC20ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_RDC20, oldNeutralStrandRDC20,
                neutralStrandRDC20, !oldNeutralStrandRDC20ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNeutralStrandRDC20() {
        Float oldNeutralStrandRDC20 = neutralStrandRDC20;
        boolean oldNeutralStrandRDC20ESet = neutralStrandRDC20ESet;
        neutralStrandRDC20 = NEUTRAL_STRAND_RDC20_EDEFAULT;
        neutralStrandRDC20ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_RDC20, oldNeutralStrandRDC20,
                NEUTRAL_STRAND_RDC20_EDEFAULT, oldNeutralStrandRDC20ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNeutralStrandRDC20() {
        return neutralStrandRDC20ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL:
            return getDiameterOverNeutral();
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT:
            return getNeutralStrandCount();
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_GMR:
            return getNeutralStrandGmr();
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_RADIUS:
            return getNeutralStrandRadius();
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_RDC20:
            return getNeutralStrandRDC20();
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
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL:
            setDiameterOverNeutral( ( Float ) newValue );
            return;
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT:
            setNeutralStrandCount( ( Integer ) newValue );
            return;
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_GMR:
            setNeutralStrandGmr( ( Float ) newValue );
            return;
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_RADIUS:
            setNeutralStrandRadius( ( Float ) newValue );
            return;
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_RDC20:
            setNeutralStrandRDC20( ( Float ) newValue );
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
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL:
            unsetDiameterOverNeutral();
            return;
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT:
            unsetNeutralStrandCount();
            return;
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_GMR:
            unsetNeutralStrandGmr();
            return;
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_RADIUS:
            unsetNeutralStrandRadius();
            return;
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_RDC20:
            unsetNeutralStrandRDC20();
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
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL:
            return isSetDiameterOverNeutral();
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT:
            return isSetNeutralStrandCount();
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_GMR:
            return isSetNeutralStrandGmr();
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_RADIUS:
            return isSetNeutralStrandRadius();
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_RDC20:
            return isSetNeutralStrandRDC20();
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
        result.append( " (diameterOverNeutral: " );
        if( diameterOverNeutralESet )
            result.append( diameterOverNeutral );
        else
            result.append( "<unset>" );
        result.append( ", neutralStrandCount: " );
        if( neutralStrandCountESet )
            result.append( neutralStrandCount );
        else
            result.append( "<unset>" );
        result.append( ", neutralStrandGmr: " );
        if( neutralStrandGmrESet )
            result.append( neutralStrandGmr );
        else
            result.append( "<unset>" );
        result.append( ", neutralStrandRadius: " );
        if( neutralStrandRadiusESet )
            result.append( neutralStrandRadius );
        else
            result.append( "<unset>" );
        result.append( ", neutralStrandRDC20: " );
        if( neutralStrandRDC20ESet )
            result.append( neutralStrandRDC20 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ConcentricNeutralCableInfoImpl
