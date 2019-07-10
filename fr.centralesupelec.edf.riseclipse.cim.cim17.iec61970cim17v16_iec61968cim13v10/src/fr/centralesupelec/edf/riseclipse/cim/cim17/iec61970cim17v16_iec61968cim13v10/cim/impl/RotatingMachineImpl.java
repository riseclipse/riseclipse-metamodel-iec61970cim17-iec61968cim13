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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotating Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RotatingMachineImpl#getP <em>P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RotatingMachineImpl#getQ <em>Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RotatingMachineImpl#getRatedPowerFactor <em>Rated Power Factor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RotatingMachineImpl#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RotatingMachineImpl#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RotatingMachineImpl#getGeneratingUnit <em>Generating Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RotatingMachineImpl#getHydroPump <em>Hydro Pump</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotatingMachineImpl extends RegulatingCondEqImpl implements RotatingMachine {
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
     * The default value of the '{@link #getRatedPowerFactor() <em>Rated Power Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedPowerFactor()
     * @generated
     * @ordered
     */
    protected static final Float RATED_POWER_FACTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedPowerFactor() <em>Rated Power Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedPowerFactor()
     * @generated
     * @ordered
     */
    protected Float ratedPowerFactor = RATED_POWER_FACTOR_EDEFAULT;

    /**
     * This is true if the Rated Power Factor attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedPowerFactorESet;

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
     * The cached value of the '{@link #getGeneratingUnit() <em>Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneratingUnit()
     * @generated
     * @ordered
     */
    protected GeneratingUnit generatingUnit;

    /**
     * This is true if the Generating Unit reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean generatingUnitESet;

    /**
     * The cached value of the '{@link #getHydroPump() <em>Hydro Pump</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroPump()
     * @generated
     * @ordered
     */
    protected HydroPump hydroPump;

    /**
     * This is true if the Hydro Pump reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hydroPumpESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RotatingMachineImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRotatingMachine();
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ROTATING_MACHINE__P, oldP, p, !oldPESet ) );
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
                CimPackage.ROTATING_MACHINE__P, oldP, P_EDEFAULT, oldPESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ROTATING_MACHINE__Q, oldQ, q, !oldQESet ) );
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
                CimPackage.ROTATING_MACHINE__Q, oldQ, Q_EDEFAULT, oldQESet ) );
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
    public Float getRatedPowerFactor() {
        return ratedPowerFactor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedPowerFactor( Float newRatedPowerFactor ) {
        Float oldRatedPowerFactor = ratedPowerFactor;
        ratedPowerFactor = newRatedPowerFactor;
        boolean oldRatedPowerFactorESet = ratedPowerFactorESet;
        ratedPowerFactorESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ROTATING_MACHINE__RATED_POWER_FACTOR,
                    oldRatedPowerFactor, ratedPowerFactor, !oldRatedPowerFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedPowerFactor() {
        Float oldRatedPowerFactor = ratedPowerFactor;
        boolean oldRatedPowerFactorESet = ratedPowerFactorESet;
        ratedPowerFactor = RATED_POWER_FACTOR_EDEFAULT;
        ratedPowerFactorESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ROTATING_MACHINE__RATED_POWER_FACTOR,
                    oldRatedPowerFactor, RATED_POWER_FACTOR_EDEFAULT, oldRatedPowerFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedPowerFactor() {
        return ratedPowerFactorESet;
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
                CimPackage.ROTATING_MACHINE__RATED_S, oldRatedS, ratedS, !oldRatedSESet ) );
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
                CimPackage.ROTATING_MACHINE__RATED_S, oldRatedS, RATED_S_EDEFAULT, oldRatedSESet ) );
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
                CimPackage.ROTATING_MACHINE__RATED_U, oldRatedU, ratedU, !oldRatedUESet ) );
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
                CimPackage.ROTATING_MACHINE__RATED_U, oldRatedU, RATED_U_EDEFAULT, oldRatedUESet ) );
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
    public GeneratingUnit getGeneratingUnit() {
        return generatingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGeneratingUnit( GeneratingUnit newGeneratingUnit, NotificationChain msgs ) {
        GeneratingUnit oldGeneratingUnit = generatingUnit;
        generatingUnit = newGeneratingUnit;
        boolean oldGeneratingUnitESet = generatingUnitESet;
        generatingUnitESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ROTATING_MACHINE__GENERATING_UNIT, oldGeneratingUnit, newGeneratingUnit,
                    !oldGeneratingUnitESet );
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
    public void setGeneratingUnit( GeneratingUnit newGeneratingUnit ) {
        if( newGeneratingUnit != generatingUnit ) {
            NotificationChain msgs = null;
            if( generatingUnit != null ) msgs = ( ( InternalEObject ) generatingUnit ).eInverseRemove( this,
                    CimPackage.GENERATING_UNIT__ROTATING_MACHINE, GeneratingUnit.class, msgs );
            if( newGeneratingUnit != null ) msgs = ( ( InternalEObject ) newGeneratingUnit ).eInverseAdd( this,
                    CimPackage.GENERATING_UNIT__ROTATING_MACHINE, GeneratingUnit.class, msgs );
            msgs = basicSetGeneratingUnit( newGeneratingUnit, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGeneratingUnitESet = generatingUnitESet;
            generatingUnitESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ROTATING_MACHINE__GENERATING_UNIT,
                        newGeneratingUnit, newGeneratingUnit, !oldGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetGeneratingUnit( NotificationChain msgs ) {
        GeneratingUnit oldGeneratingUnit = generatingUnit;
        generatingUnit = null;
        boolean oldGeneratingUnitESet = generatingUnitESet;
        generatingUnitESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ROTATING_MACHINE__GENERATING_UNIT, oldGeneratingUnit, null, oldGeneratingUnitESet );
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
    public void unsetGeneratingUnit() {
        if( generatingUnit != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) generatingUnit ).eInverseRemove( this,
                    CimPackage.GENERATING_UNIT__ROTATING_MACHINE, GeneratingUnit.class, msgs );
            msgs = basicUnsetGeneratingUnit( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGeneratingUnitESet = generatingUnitESet;
            generatingUnitESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ROTATING_MACHINE__GENERATING_UNIT, null, null, oldGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGeneratingUnit() {
        return generatingUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroPump getHydroPump() {
        return hydroPump;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHydroPump( HydroPump newHydroPump, NotificationChain msgs ) {
        HydroPump oldHydroPump = hydroPump;
        hydroPump = newHydroPump;
        boolean oldHydroPumpESet = hydroPumpESet;
        hydroPumpESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ROTATING_MACHINE__HYDRO_PUMP, oldHydroPump, newHydroPump, !oldHydroPumpESet );
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
    public void setHydroPump( HydroPump newHydroPump ) {
        if( newHydroPump != hydroPump ) {
            NotificationChain msgs = null;
            if( hydroPump != null ) msgs = ( ( InternalEObject ) hydroPump ).eInverseRemove( this,
                    CimPackage.HYDRO_PUMP__ROTATING_MACHINE, HydroPump.class, msgs );
            if( newHydroPump != null ) msgs = ( ( InternalEObject ) newHydroPump ).eInverseAdd( this,
                    CimPackage.HYDRO_PUMP__ROTATING_MACHINE, HydroPump.class, msgs );
            msgs = basicSetHydroPump( newHydroPump, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHydroPumpESet = hydroPumpESet;
            hydroPumpESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ROTATING_MACHINE__HYDRO_PUMP, newHydroPump, newHydroPump, !oldHydroPumpESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetHydroPump( NotificationChain msgs ) {
        HydroPump oldHydroPump = hydroPump;
        hydroPump = null;
        boolean oldHydroPumpESet = hydroPumpESet;
        hydroPumpESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ROTATING_MACHINE__HYDRO_PUMP, oldHydroPump, null, oldHydroPumpESet );
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
    public void unsetHydroPump() {
        if( hydroPump != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) hydroPump ).eInverseRemove( this, CimPackage.HYDRO_PUMP__ROTATING_MACHINE,
                    HydroPump.class, msgs );
            msgs = basicUnsetHydroPump( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHydroPumpESet = hydroPumpESet;
            hydroPumpESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ROTATING_MACHINE__HYDRO_PUMP, null, null, oldHydroPumpESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydroPump() {
        return hydroPumpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ROTATING_MACHINE__GENERATING_UNIT:
            if( generatingUnit != null ) msgs = ( ( InternalEObject ) generatingUnit ).eInverseRemove( this,
                    CimPackage.GENERATING_UNIT__ROTATING_MACHINE, GeneratingUnit.class, msgs );
            return basicSetGeneratingUnit( ( GeneratingUnit ) otherEnd, msgs );
        case CimPackage.ROTATING_MACHINE__HYDRO_PUMP:
            if( hydroPump != null ) msgs = ( ( InternalEObject ) hydroPump ).eInverseRemove( this,
                    CimPackage.HYDRO_PUMP__ROTATING_MACHINE, HydroPump.class, msgs );
            return basicSetHydroPump( ( HydroPump ) otherEnd, msgs );
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
        case CimPackage.ROTATING_MACHINE__GENERATING_UNIT:
            return basicUnsetGeneratingUnit( msgs );
        case CimPackage.ROTATING_MACHINE__HYDRO_PUMP:
            return basicUnsetHydroPump( msgs );
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
        case CimPackage.ROTATING_MACHINE__P:
            return getP();
        case CimPackage.ROTATING_MACHINE__Q:
            return getQ();
        case CimPackage.ROTATING_MACHINE__RATED_POWER_FACTOR:
            return getRatedPowerFactor();
        case CimPackage.ROTATING_MACHINE__RATED_S:
            return getRatedS();
        case CimPackage.ROTATING_MACHINE__RATED_U:
            return getRatedU();
        case CimPackage.ROTATING_MACHINE__GENERATING_UNIT:
            return getGeneratingUnit();
        case CimPackage.ROTATING_MACHINE__HYDRO_PUMP:
            return getHydroPump();
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
        case CimPackage.ROTATING_MACHINE__P:
            setP( ( Float ) newValue );
            return;
        case CimPackage.ROTATING_MACHINE__Q:
            setQ( ( Float ) newValue );
            return;
        case CimPackage.ROTATING_MACHINE__RATED_POWER_FACTOR:
            setRatedPowerFactor( ( Float ) newValue );
            return;
        case CimPackage.ROTATING_MACHINE__RATED_S:
            setRatedS( ( Float ) newValue );
            return;
        case CimPackage.ROTATING_MACHINE__RATED_U:
            setRatedU( ( Float ) newValue );
            return;
        case CimPackage.ROTATING_MACHINE__GENERATING_UNIT:
            setGeneratingUnit( ( GeneratingUnit ) newValue );
            return;
        case CimPackage.ROTATING_MACHINE__HYDRO_PUMP:
            setHydroPump( ( HydroPump ) newValue );
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
        case CimPackage.ROTATING_MACHINE__P:
            unsetP();
            return;
        case CimPackage.ROTATING_MACHINE__Q:
            unsetQ();
            return;
        case CimPackage.ROTATING_MACHINE__RATED_POWER_FACTOR:
            unsetRatedPowerFactor();
            return;
        case CimPackage.ROTATING_MACHINE__RATED_S:
            unsetRatedS();
            return;
        case CimPackage.ROTATING_MACHINE__RATED_U:
            unsetRatedU();
            return;
        case CimPackage.ROTATING_MACHINE__GENERATING_UNIT:
            unsetGeneratingUnit();
            return;
        case CimPackage.ROTATING_MACHINE__HYDRO_PUMP:
            unsetHydroPump();
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
        case CimPackage.ROTATING_MACHINE__P:
            return isSetP();
        case CimPackage.ROTATING_MACHINE__Q:
            return isSetQ();
        case CimPackage.ROTATING_MACHINE__RATED_POWER_FACTOR:
            return isSetRatedPowerFactor();
        case CimPackage.ROTATING_MACHINE__RATED_S:
            return isSetRatedS();
        case CimPackage.ROTATING_MACHINE__RATED_U:
            return isSetRatedU();
        case CimPackage.ROTATING_MACHINE__GENERATING_UNIT:
            return isSetGeneratingUnit();
        case CimPackage.ROTATING_MACHINE__HYDRO_PUMP:
            return isSetHydroPump();
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
        result.append( " (p: " );
        if( pESet )
            result.append( p );
        else
            result.append( "<unset>" );
        result.append( ", q: " );
        if( qESet )
            result.append( q );
        else
            result.append( "<unset>" );
        result.append( ", ratedPowerFactor: " );
        if( ratedPowerFactorESet )
            result.append( ratedPowerFactor );
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
        result.append( ')' );
        return result.toString();
    }

} //RotatingMachineImpl
