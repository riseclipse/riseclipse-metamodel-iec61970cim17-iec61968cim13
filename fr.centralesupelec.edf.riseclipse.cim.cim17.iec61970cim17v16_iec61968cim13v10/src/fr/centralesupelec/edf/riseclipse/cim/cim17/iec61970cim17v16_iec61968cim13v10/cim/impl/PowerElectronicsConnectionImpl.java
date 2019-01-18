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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerElectronicsConnection;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerElectronicsUnit;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4Dynamics;

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
 * An implementation of the model object '<em><b>Power Electronics Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerElectronicsConnectionImpl#getMaxQ <em>Max Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerElectronicsConnectionImpl#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerElectronicsConnectionImpl#getP <em>P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerElectronicsConnectionImpl#getQ <em>Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerElectronicsConnectionImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerElectronicsConnectionImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerElectronicsConnectionImpl#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerElectronicsConnectionImpl#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerElectronicsConnectionImpl#getRn <em>Rn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerElectronicsConnectionImpl#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerElectronicsConnectionImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerElectronicsConnectionImpl#getXn <em>Xn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerElectronicsConnectionImpl#getWindTurbineType3or4 <em>Wind Turbine Type3or4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerElectronicsConnectionImpl#getPowerElectronicsUnit <em>Power Electronics Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerElectronicsConnectionImpl extends RegulatingCondEqImpl implements PowerElectronicsConnection {
    /**
     * The default value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxQ()
     * @generated
     * @ordered
     */
    protected static final Float MAX_Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxQ()
     * @generated
     * @ordered
     */
    protected Float maxQ = MAX_Q_EDEFAULT;

    /**
     * This is true if the Max Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxQESet;

    /**
     * The default value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinQ()
     * @generated
     * @ordered
     */
    protected static final Float MIN_Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinQ()
     * @generated
     * @ordered
     */
    protected Float minQ = MIN_Q_EDEFAULT;

    /**
     * This is true if the Min Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minQESet;

    /**
     * The default value of the '{@link #getP() <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP()
     * @generated
     * @ordered
     */
    protected static final Float P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP() <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP()
     * @generated
     * @ordered
     */
    protected Float p = P_EDEFAULT;

    /**
     * This is true if the P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pESet;

    /**
     * The default value of the '{@link #getQ() <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ()
     * @generated
     * @ordered
     */
    protected static final Float Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ() <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ()
     * @generated
     * @ordered
     */
    protected Float q = Q_EDEFAULT;

    /**
     * This is true if the Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qESet;

    /**
     * The default value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected static final Float R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected Float r = R_EDEFAULT;

    /**
     * This is true if the R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rESet;

    /**
     * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected static final Float R0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected Float r0 = R0_EDEFAULT;

    /**
     * This is true if the R0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r0ESet;

    /**
     * The default value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedS()
     * @generated
     * @ordered
     */
    protected static final Float RATED_S_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedS()
     * @generated
     * @ordered
     */
    protected Float ratedS = RATED_S_EDEFAULT;

    /**
     * This is true if the Rated S attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedSESet;

    /**
     * The default value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedU()
     * @generated
     * @ordered
     */
    protected static final Float RATED_U_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedU()
     * @generated
     * @ordered
     */
    protected Float ratedU = RATED_U_EDEFAULT;

    /**
     * This is true if the Rated U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedUESet;

    /**
     * The default value of the '{@link #getRn() <em>Rn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRn()
     * @generated
     * @ordered
     */
    protected static final Float RN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRn() <em>Rn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRn()
     * @generated
     * @ordered
     */
    protected Float rn = RN_EDEFAULT;

    /**
     * This is true if the Rn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rnESet;

    /**
     * The default value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected static final Float X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected Float x = X_EDEFAULT;

    /**
     * This is true if the X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xESet;

    /**
     * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected static final Float X0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected Float x0 = X0_EDEFAULT;

    /**
     * This is true if the X0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x0ESet;

    /**
     * The default value of the '{@link #getXn() <em>Xn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXn()
     * @generated
     * @ordered
     */
    protected static final Float XN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXn() <em>Xn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXn()
     * @generated
     * @ordered
     */
    protected Float xn = XN_EDEFAULT;

    /**
     * This is true if the Xn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xnESet;

    /**
     * The cached value of the '{@link #getWindTurbineType3or4() <em>Wind Turbine Type3or4</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType3or4()
     * @generated
     * @ordered
     */
    protected WindTurbineType3or4Dynamics windTurbineType3or4;

    /**
     * This is true if the Wind Turbine Type3or4 reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType3or4ESet;

    /**
     * The cached value of the '{@link #getPowerElectronicsUnit() <em>Power Electronics Unit</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerElectronicsUnit()
     * @generated
     * @ordered
     */
    protected EList< PowerElectronicsUnit > powerElectronicsUnit;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerElectronicsConnectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPowerElectronicsConnection();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxQ() {
        return maxQ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxQ( Float newMaxQ ) {
        Float oldMaxQ = maxQ;
        maxQ = newMaxQ;
        boolean oldMaxQESet = maxQESet;
        maxQESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__MAX_Q, oldMaxQ, maxQ, !oldMaxQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxQ() {
        Float oldMaxQ = maxQ;
        boolean oldMaxQESet = maxQESet;
        maxQ = MAX_Q_EDEFAULT;
        maxQESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__MAX_Q, oldMaxQ, MAX_Q_EDEFAULT, oldMaxQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxQ() {
        return maxQESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinQ() {
        return minQ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinQ( Float newMinQ ) {
        Float oldMinQ = minQ;
        minQ = newMinQ;
        boolean oldMinQESet = minQESet;
        minQESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__MIN_Q, oldMinQ, minQ, !oldMinQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinQ() {
        Float oldMinQ = minQ;
        boolean oldMinQESet = minQESet;
        minQ = MIN_Q_EDEFAULT;
        minQESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__MIN_Q, oldMinQ, MIN_Q_EDEFAULT, oldMinQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinQ() {
        return minQESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP() {
        return p;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP( Float newP ) {
        Float oldP = p;
        p = newP;
        boolean oldPESet = pESet;
        pESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__P, oldP, p, !oldPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP() {
        Float oldP = p;
        boolean oldPESet = pESet;
        p = P_EDEFAULT;
        pESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__P, oldP, P_EDEFAULT, oldPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP() {
        return pESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ() {
        return q;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ( Float newQ ) {
        Float oldQ = q;
        q = newQ;
        boolean oldQESet = qESet;
        qESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__Q, oldQ, q, !oldQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ() {
        Float oldQ = q;
        boolean oldQESet = qESet;
        q = Q_EDEFAULT;
        qESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__Q, oldQ, Q_EDEFAULT, oldQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ() {
        return qESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR() {
        return r;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR( Float newR ) {
        Float oldR = r;
        r = newR;
        boolean oldRESet = rESet;
        rESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__R, oldR, r, !oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR() {
        Float oldR = r;
        boolean oldRESet = rESet;
        r = R_EDEFAULT;
        rESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__R, oldR, R_EDEFAULT, oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR() {
        return rESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR0() {
        return r0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR0( Float newR0 ) {
        Float oldR0 = r0;
        r0 = newR0;
        boolean oldR0ESet = r0ESet;
        r0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__R0, oldR0, r0, !oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR0() {
        Float oldR0 = r0;
        boolean oldR0ESet = r0ESet;
        r0 = R0_EDEFAULT;
        r0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__R0, oldR0, R0_EDEFAULT, oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR0() {
        return r0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedS() {
        return ratedS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedS( Float newRatedS ) {
        Float oldRatedS = ratedS;
        ratedS = newRatedS;
        boolean oldRatedSESet = ratedSESet;
        ratedSESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_S, oldRatedS, ratedS, !oldRatedSESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedS() {
        Float oldRatedS = ratedS;
        boolean oldRatedSESet = ratedSESet;
        ratedS = RATED_S_EDEFAULT;
        ratedSESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_S, oldRatedS, RATED_S_EDEFAULT, oldRatedSESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedS() {
        return ratedSESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedU() {
        return ratedU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedU( Float newRatedU ) {
        Float oldRatedU = ratedU;
        ratedU = newRatedU;
        boolean oldRatedUESet = ratedUESet;
        ratedUESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_U, oldRatedU, ratedU, !oldRatedUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedU() {
        Float oldRatedU = ratedU;
        boolean oldRatedUESet = ratedUESet;
        ratedU = RATED_U_EDEFAULT;
        ratedUESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_U, oldRatedU, RATED_U_EDEFAULT, oldRatedUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedU() {
        return ratedUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRn() {
        return rn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRn( Float newRn ) {
        Float oldRn = rn;
        rn = newRn;
        boolean oldRnESet = rnESet;
        rnESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__RN, oldRn, rn, !oldRnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRn() {
        Float oldRn = rn;
        boolean oldRnESet = rnESet;
        rn = RN_EDEFAULT;
        rnESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__RN, oldRn, RN_EDEFAULT, oldRnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRn() {
        return rnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX() {
        return x;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX( Float newX ) {
        Float oldX = x;
        x = newX;
        boolean oldXESet = xESet;
        xESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__X, oldX, x, !oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX() {
        Float oldX = x;
        boolean oldXESet = xESet;
        x = X_EDEFAULT;
        xESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__X, oldX, X_EDEFAULT, oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX() {
        return xESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX0() {
        return x0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX0( Float newX0 ) {
        Float oldX0 = x0;
        x0 = newX0;
        boolean oldX0ESet = x0ESet;
        x0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__X0, oldX0, x0, !oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX0() {
        Float oldX0 = x0;
        boolean oldX0ESet = x0ESet;
        x0 = X0_EDEFAULT;
        x0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__X0, oldX0, X0_EDEFAULT, oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX0() {
        return x0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXn() {
        return xn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXn( Float newXn ) {
        Float oldXn = xn;
        xn = newXn;
        boolean oldXnESet = xnESet;
        xnESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__XN, oldXn, xn, !oldXnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXn() {
        Float oldXn = xn;
        boolean oldXnESet = xnESet;
        xn = XN_EDEFAULT;
        xnESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_ELECTRONICS_CONNECTION__XN, oldXn, XN_EDEFAULT, oldXnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXn() {
        return xnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType3or4Dynamics getWindTurbineType3or4() {
        if( windTurbineType3or4 != null && windTurbineType3or4.eIsProxy() ) {
            InternalEObject oldWindTurbineType3or4 = ( InternalEObject ) windTurbineType3or4;
            windTurbineType3or4 = ( WindTurbineType3or4Dynamics ) eResolveProxy( oldWindTurbineType3or4 );
            if( windTurbineType3or4 != oldWindTurbineType3or4 ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4, oldWindTurbineType3or4,
                        windTurbineType3or4 ) );
            }
        }
        return windTurbineType3or4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindTurbineType3or4Dynamics basicGetWindTurbineType3or4() {
        return windTurbineType3or4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType3or4( WindTurbineType3or4Dynamics newWindTurbineType3or4,
            NotificationChain msgs ) {
        WindTurbineType3or4Dynamics oldWindTurbineType3or4 = windTurbineType3or4;
        windTurbineType3or4 = newWindTurbineType3or4;
        boolean oldWindTurbineType3or4ESet = windTurbineType3or4ESet;
        windTurbineType3or4ESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4, oldWindTurbineType3or4,
                    newWindTurbineType3or4, !oldWindTurbineType3or4ESet );
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
    public void setWindTurbineType3or4( WindTurbineType3or4Dynamics newWindTurbineType3or4 ) {
        if( newWindTurbineType3or4 != windTurbineType3or4 ) {
            NotificationChain msgs = null;
            if( windTurbineType3or4 != null ) msgs = ( ( InternalEObject ) windTurbineType3or4 ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__POWER_ELECTRONICS_CONNECTION,
                    WindTurbineType3or4Dynamics.class, msgs );
            if( newWindTurbineType3or4 != null )
                msgs = ( ( InternalEObject ) newWindTurbineType3or4 ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__POWER_ELECTRONICS_CONNECTION,
                        WindTurbineType3or4Dynamics.class, msgs );
            msgs = basicSetWindTurbineType3or4( newWindTurbineType3or4, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3or4ESet = windTurbineType3or4ESet;
            windTurbineType3or4ESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4, newWindTurbineType3or4,
                    newWindTurbineType3or4, !oldWindTurbineType3or4ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType3or4( NotificationChain msgs ) {
        WindTurbineType3or4Dynamics oldWindTurbineType3or4 = windTurbineType3or4;
        windTurbineType3or4 = null;
        boolean oldWindTurbineType3or4ESet = windTurbineType3or4ESet;
        windTurbineType3or4ESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4, oldWindTurbineType3or4, null,
                    oldWindTurbineType3or4ESet );
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
    public void unsetWindTurbineType3or4() {
        if( windTurbineType3or4 != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType3or4 ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__POWER_ELECTRONICS_CONNECTION,
                    WindTurbineType3or4Dynamics.class, msgs );
            msgs = basicUnsetWindTurbineType3or4( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3or4ESet = windTurbineType3or4ESet;
            windTurbineType3or4ESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4, null, null,
                    oldWindTurbineType3or4ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType3or4() {
        return windTurbineType3or4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PowerElectronicsUnit > getPowerElectronicsUnit() {
        if( powerElectronicsUnit == null ) {
            powerElectronicsUnit = new EObjectWithInverseResolvingEList.Unsettable< PowerElectronicsUnit >(
                    PowerElectronicsUnit.class, this, CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT,
                    CimPackage.POWER_ELECTRONICS_UNIT__POWER_ELECTRONICS_CONNECTION );
        }
        return powerElectronicsUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPowerElectronicsUnit() {
        if( powerElectronicsUnit != null ) ( ( InternalEList.Unsettable< ? > ) powerElectronicsUnit ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerElectronicsUnit() {
        return powerElectronicsUnit != null && ( ( InternalEList.Unsettable< ? > ) powerElectronicsUnit ).isSet();
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
        case CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4:
            if( windTurbineType3or4 != null ) msgs = ( ( InternalEObject ) windTurbineType3or4 ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__POWER_ELECTRONICS_CONNECTION,
                    WindTurbineType3or4Dynamics.class, msgs );
            return basicSetWindTurbineType3or4( ( WindTurbineType3or4Dynamics ) otherEnd, msgs );
        case CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPowerElectronicsUnit() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4:
            return basicUnsetWindTurbineType3or4( msgs );
        case CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT:
            return ( ( InternalEList< ? > ) getPowerElectronicsUnit() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MAX_Q:
            return getMaxQ();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MIN_Q:
            return getMinQ();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__P:
            return getP();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__Q:
            return getQ();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__R:
            return getR();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__R0:
            return getR0();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_S:
            return getRatedS();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_U:
            return getRatedU();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RN:
            return getRn();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__X:
            return getX();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__X0:
            return getX0();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__XN:
            return getXn();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4:
            if( resolve ) return getWindTurbineType3or4();
            return basicGetWindTurbineType3or4();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT:
            return getPowerElectronicsUnit();
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
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MAX_Q:
            setMaxQ( ( Float ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MIN_Q:
            setMinQ( ( Float ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__P:
            setP( ( Float ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__Q:
            setQ( ( Float ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__R:
            setR( ( Float ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__R0:
            setR0( ( Float ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_S:
            setRatedS( ( Float ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_U:
            setRatedU( ( Float ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RN:
            setRn( ( Float ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__X:
            setX( ( Float ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__X0:
            setX0( ( Float ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__XN:
            setXn( ( Float ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4:
            setWindTurbineType3or4( ( WindTurbineType3or4Dynamics ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT:
            getPowerElectronicsUnit().clear();
            getPowerElectronicsUnit().addAll( ( Collection< ? extends PowerElectronicsUnit > ) newValue );
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
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MAX_Q:
            unsetMaxQ();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MIN_Q:
            unsetMinQ();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__P:
            unsetP();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__Q:
            unsetQ();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__R:
            unsetR();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__R0:
            unsetR0();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_S:
            unsetRatedS();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_U:
            unsetRatedU();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RN:
            unsetRn();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__X:
            unsetX();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__X0:
            unsetX0();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__XN:
            unsetXn();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4:
            unsetWindTurbineType3or4();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT:
            unsetPowerElectronicsUnit();
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
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MAX_Q:
            return isSetMaxQ();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MIN_Q:
            return isSetMinQ();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__P:
            return isSetP();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__Q:
            return isSetQ();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__R:
            return isSetR();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__R0:
            return isSetR0();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_S:
            return isSetRatedS();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_U:
            return isSetRatedU();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RN:
            return isSetRn();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__X:
            return isSetX();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__X0:
            return isSetX0();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__XN:
            return isSetXn();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4:
            return isSetWindTurbineType3or4();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT:
            return isSetPowerElectronicsUnit();
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
        result.append( " (maxQ: " );
        if( maxQESet )
            result.append( maxQ );
        else
            result.append( "<unset>" );
        result.append( ", minQ: " );
        if( minQESet )
            result.append( minQ );
        else
            result.append( "<unset>" );
        result.append( ", p: " );
        if( pESet )
            result.append( p );
        else
            result.append( "<unset>" );
        result.append( ", q: " );
        if( qESet )
            result.append( q );
        else
            result.append( "<unset>" );
        result.append( ", r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", r0: " );
        if( r0ESet )
            result.append( r0 );
        else
            result.append( "<unset>" );
        result.append( ", ratedS: " );
        if( ratedSESet )
            result.append( ratedS );
        else
            result.append( "<unset>" );
        result.append( ", ratedU: " );
        if( ratedUESet )
            result.append( ratedU );
        else
            result.append( "<unset>" );
        result.append( ", rn: " );
        if( rnESet )
            result.append( rn );
        else
            result.append( "<unset>" );
        result.append( ", x: " );
        if( xESet )
            result.append( x );
        else
            result.append( "<unset>" );
        result.append( ", x0: " );
        if( x0ESet )
            result.append( x0 );
        else
            result.append( "<unset>" );
        result.append( ", xn: " );
        if( xnESet )
            result.append( xn );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PowerElectronicsConnectionImpl
