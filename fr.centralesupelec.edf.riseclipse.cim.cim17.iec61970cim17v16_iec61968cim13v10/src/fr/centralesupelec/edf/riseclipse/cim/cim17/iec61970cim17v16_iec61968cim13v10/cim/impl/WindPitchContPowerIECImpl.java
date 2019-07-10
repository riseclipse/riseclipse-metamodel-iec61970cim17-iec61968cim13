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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType1bIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType2IEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPitchContPowerIEC;

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
 * An implementation of the model object '<em><b>Wind Pitch Cont Power IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPitchContPowerIECImpl#getDpmax <em>Dpmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPitchContPowerIECImpl#getDpmin <em>Dpmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPitchContPowerIECImpl#getPmin <em>Pmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPitchContPowerIECImpl#getPset <em>Pset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPitchContPowerIECImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPitchContPowerIECImpl#getTr <em>Tr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPitchContPowerIECImpl#getUuvrt <em>Uuvrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPitchContPowerIECImpl#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPitchContPowerIECImpl#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPitchContPowerIECImpl#getWindGenTurbineType1bIEC <em>Wind Gen Turbine Type1b IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindPitchContPowerIECImpl extends IdentifiedObjectImpl implements WindPitchContPowerIEC {
    /**
     * The default value of the '{@link #getDpmax() <em>Dpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpmax()
     * @generated
     * @ordered
     */
    protected static final Float DPMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDpmax() <em>Dpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpmax()
     * @generated
     * @ordered
     */
    protected Float dpmax = DPMAX_EDEFAULT;

    /**
     * This is true if the Dpmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dpmaxESet;

    /**
     * The default value of the '{@link #getDpmin() <em>Dpmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpmin()
     * @generated
     * @ordered
     */
    protected static final Float DPMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDpmin() <em>Dpmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpmin()
     * @generated
     * @ordered
     */
    protected Float dpmin = DPMIN_EDEFAULT;

    /**
     * This is true if the Dpmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dpminESet;

    /**
     * The default value of the '{@link #getPmin() <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmin()
     * @generated
     * @ordered
     */
    protected static final Float PMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmin() <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmin()
     * @generated
     * @ordered
     */
    protected Float pmin = PMIN_EDEFAULT;

    /**
     * This is true if the Pmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pminESet;

    /**
     * The default value of the '{@link #getPset() <em>Pset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPset()
     * @generated
     * @ordered
     */
    protected static final Float PSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPset() <em>Pset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPset()
     * @generated
     * @ordered
     */
    protected Float pset = PSET_EDEFAULT;

    /**
     * This is true if the Pset attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean psetESet;

    /**
     * The default value of the '{@link #getT1() <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1()
     * @generated
     * @ordered
     */
    protected static final Float T1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT1() <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1()
     * @generated
     * @ordered
     */
    protected Float t1 = T1_EDEFAULT;

    /**
     * This is true if the T1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t1ESet;

    /**
     * The default value of the '{@link #getTr() <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTr()
     * @generated
     * @ordered
     */
    protected static final Float TR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTr() <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTr()
     * @generated
     * @ordered
     */
    protected Float tr = TR_EDEFAULT;

    /**
     * This is true if the Tr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean trESet;

    /**
     * The default value of the '{@link #getUuvrt() <em>Uuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUuvrt()
     * @generated
     * @ordered
     */
    protected static final Float UUVRT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUuvrt() <em>Uuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUuvrt()
     * @generated
     * @ordered
     */
    protected Float uuvrt = UUVRT_EDEFAULT;

    /**
     * This is true if the Uuvrt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uuvrtESet;

    /**
     * The cached value of the '{@link #getWindDynamicsLookupTable() <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindDynamicsLookupTable()
     * @generated
     * @ordered
     */
    protected EList< WindDynamicsLookupTable > windDynamicsLookupTable;

    /**
     * The cached value of the '{@link #getWindGenTurbineType2IEC() <em>Wind Gen Turbine Type2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindGenTurbineType2IEC()
     * @generated
     * @ordered
     */
    protected WindGenTurbineType2IEC windGenTurbineType2IEC;

    /**
     * This is true if the Wind Gen Turbine Type2 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windGenTurbineType2IECESet;

    /**
     * The cached value of the '{@link #getWindGenTurbineType1bIEC() <em>Wind Gen Turbine Type1b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindGenTurbineType1bIEC()
     * @generated
     * @ordered
     */
    protected WindGenTurbineType1bIEC windGenTurbineType1bIEC;

    /**
     * This is true if the Wind Gen Turbine Type1b IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windGenTurbineType1bIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindPitchContPowerIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindPitchContPowerIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDpmax() {
        return dpmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDpmax( Float newDpmax ) {
        Float oldDpmax = dpmax;
        dpmax = newDpmax;
        boolean oldDpmaxESet = dpmaxESet;
        dpmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PITCH_CONT_POWER_IEC__DPMAX, oldDpmax, dpmax, !oldDpmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDpmax() {
        Float oldDpmax = dpmax;
        boolean oldDpmaxESet = dpmaxESet;
        dpmax = DPMAX_EDEFAULT;
        dpmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PITCH_CONT_POWER_IEC__DPMAX, oldDpmax, DPMAX_EDEFAULT, oldDpmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDpmax() {
        return dpmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDpmin() {
        return dpmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDpmin( Float newDpmin ) {
        Float oldDpmin = dpmin;
        dpmin = newDpmin;
        boolean oldDpminESet = dpminESet;
        dpminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PITCH_CONT_POWER_IEC__DPMIN, oldDpmin, dpmin, !oldDpminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDpmin() {
        Float oldDpmin = dpmin;
        boolean oldDpminESet = dpminESet;
        dpmin = DPMIN_EDEFAULT;
        dpminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PITCH_CONT_POWER_IEC__DPMIN, oldDpmin, DPMIN_EDEFAULT, oldDpminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDpmin() {
        return dpminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPmin() {
        return pmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmin( Float newPmin ) {
        Float oldPmin = pmin;
        pmin = newPmin;
        boolean oldPminESet = pminESet;
        pminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PITCH_CONT_POWER_IEC__PMIN, oldPmin, pmin, !oldPminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmin() {
        Float oldPmin = pmin;
        boolean oldPminESet = pminESet;
        pmin = PMIN_EDEFAULT;
        pminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PITCH_CONT_POWER_IEC__PMIN, oldPmin, PMIN_EDEFAULT, oldPminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmin() {
        return pminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPset() {
        return pset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPset( Float newPset ) {
        Float oldPset = pset;
        pset = newPset;
        boolean oldPsetESet = psetESet;
        psetESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PITCH_CONT_POWER_IEC__PSET, oldPset, pset, !oldPsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPset() {
        Float oldPset = pset;
        boolean oldPsetESet = psetESet;
        pset = PSET_EDEFAULT;
        psetESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PITCH_CONT_POWER_IEC__PSET, oldPset, PSET_EDEFAULT, oldPsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPset() {
        return psetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getT1() {
        return t1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT1( Float newT1 ) {
        Float oldT1 = t1;
        t1 = newT1;
        boolean oldT1ESet = t1ESet;
        t1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PITCH_CONT_POWER_IEC__T1, oldT1, t1, !oldT1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT1() {
        Float oldT1 = t1;
        boolean oldT1ESet = t1ESet;
        t1 = T1_EDEFAULT;
        t1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PITCH_CONT_POWER_IEC__T1, oldT1, T1_EDEFAULT, oldT1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT1() {
        return t1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTr() {
        return tr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTr( Float newTr ) {
        Float oldTr = tr;
        tr = newTr;
        boolean oldTrESet = trESet;
        trESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PITCH_CONT_POWER_IEC__TR, oldTr, tr, !oldTrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTr() {
        Float oldTr = tr;
        boolean oldTrESet = trESet;
        tr = TR_EDEFAULT;
        trESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PITCH_CONT_POWER_IEC__TR, oldTr, TR_EDEFAULT, oldTrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTr() {
        return trESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUuvrt() {
        return uuvrt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUuvrt( Float newUuvrt ) {
        Float oldUuvrt = uuvrt;
        uuvrt = newUuvrt;
        boolean oldUuvrtESet = uuvrtESet;
        uuvrtESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PITCH_CONT_POWER_IEC__UUVRT, oldUuvrt, uuvrt, !oldUuvrtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUuvrt() {
        Float oldUuvrt = uuvrt;
        boolean oldUuvrtESet = uuvrtESet;
        uuvrt = UUVRT_EDEFAULT;
        uuvrtESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PITCH_CONT_POWER_IEC__UUVRT, oldUuvrt, UUVRT_EDEFAULT, oldUuvrtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUuvrt() {
        return uuvrtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WindDynamicsLookupTable > getWindDynamicsLookupTable() {
        if( windDynamicsLookupTable == null ) {
            windDynamicsLookupTable = new EObjectWithInverseResolvingEList.Unsettable< WindDynamicsLookupTable >(
                    WindDynamicsLookupTable.class, this,
                    CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_DYNAMICS_LOOKUP_TABLE,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PITCH_CONT_POWER_IEC );
        }
        return windDynamicsLookupTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWindDynamicsLookupTable() {
        if( windDynamicsLookupTable != null ) ( ( InternalEList.Unsettable< ? > ) windDynamicsLookupTable ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindDynamicsLookupTable() {
        return windDynamicsLookupTable != null && ( ( InternalEList.Unsettable< ? > ) windDynamicsLookupTable ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenTurbineType2IEC getWindGenTurbineType2IEC() {
        return windGenTurbineType2IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindGenTurbineType2IEC( WindGenTurbineType2IEC newWindGenTurbineType2IEC,
            NotificationChain msgs ) {
        WindGenTurbineType2IEC oldWindGenTurbineType2IEC = windGenTurbineType2IEC;
        windGenTurbineType2IEC = newWindGenTurbineType2IEC;
        boolean oldWindGenTurbineType2IECESet = windGenTurbineType2IECESet;
        windGenTurbineType2IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE2_IEC, oldWindGenTurbineType2IEC,
                    newWindGenTurbineType2IEC, !oldWindGenTurbineType2IECESet );
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
    public void setWindGenTurbineType2IEC( WindGenTurbineType2IEC newWindGenTurbineType2IEC ) {
        if( newWindGenTurbineType2IEC != windGenTurbineType2IEC ) {
            NotificationChain msgs = null;
            if( windGenTurbineType2IEC != null )
                msgs = ( ( InternalEObject ) windGenTurbineType2IEC ).eInverseRemove( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_POWER_IEC, WindGenTurbineType2IEC.class,
                        msgs );
            if( newWindGenTurbineType2IEC != null )
                msgs = ( ( InternalEObject ) newWindGenTurbineType2IEC ).eInverseAdd( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_POWER_IEC, WindGenTurbineType2IEC.class,
                        msgs );
            msgs = basicSetWindGenTurbineType2IEC( newWindGenTurbineType2IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenTurbineType2IECESet = windGenTurbineType2IECESet;
            windGenTurbineType2IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE2_IEC, newWindGenTurbineType2IEC,
                    newWindGenTurbineType2IEC, !oldWindGenTurbineType2IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindGenTurbineType2IEC( NotificationChain msgs ) {
        WindGenTurbineType2IEC oldWindGenTurbineType2IEC = windGenTurbineType2IEC;
        windGenTurbineType2IEC = null;
        boolean oldWindGenTurbineType2IECESet = windGenTurbineType2IECESet;
        windGenTurbineType2IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE2_IEC, oldWindGenTurbineType2IEC, null,
                    oldWindGenTurbineType2IECESet );
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
    public void unsetWindGenTurbineType2IEC() {
        if( windGenTurbineType2IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windGenTurbineType2IEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_POWER_IEC, WindGenTurbineType2IEC.class,
                    msgs );
            msgs = basicUnsetWindGenTurbineType2IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenTurbineType2IECESet = windGenTurbineType2IECESet;
            windGenTurbineType2IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE2_IEC, null, null,
                    oldWindGenTurbineType2IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindGenTurbineType2IEC() {
        return windGenTurbineType2IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenTurbineType1bIEC getWindGenTurbineType1bIEC() {
        return windGenTurbineType1bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindGenTurbineType1bIEC( WindGenTurbineType1bIEC newWindGenTurbineType1bIEC,
            NotificationChain msgs ) {
        WindGenTurbineType1bIEC oldWindGenTurbineType1bIEC = windGenTurbineType1bIEC;
        windGenTurbineType1bIEC = newWindGenTurbineType1bIEC;
        boolean oldWindGenTurbineType1bIECESet = windGenTurbineType1bIECESet;
        windGenTurbineType1bIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE1B_IEC, oldWindGenTurbineType1bIEC,
                    newWindGenTurbineType1bIEC, !oldWindGenTurbineType1bIECESet );
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
    public void setWindGenTurbineType1bIEC( WindGenTurbineType1bIEC newWindGenTurbineType1bIEC ) {
        if( newWindGenTurbineType1bIEC != windGenTurbineType1bIEC ) {
            NotificationChain msgs = null;
            if( windGenTurbineType1bIEC != null )
                msgs = ( ( InternalEObject ) windGenTurbineType1bIEC ).eInverseRemove( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC__WIND_PITCH_CONT_POWER_IEC,
                        WindGenTurbineType1bIEC.class, msgs );
            if( newWindGenTurbineType1bIEC != null )
                msgs = ( ( InternalEObject ) newWindGenTurbineType1bIEC ).eInverseAdd( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC__WIND_PITCH_CONT_POWER_IEC,
                        WindGenTurbineType1bIEC.class, msgs );
            msgs = basicSetWindGenTurbineType1bIEC( newWindGenTurbineType1bIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenTurbineType1bIECESet = windGenTurbineType1bIECESet;
            windGenTurbineType1bIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE1B_IEC, newWindGenTurbineType1bIEC,
                    newWindGenTurbineType1bIEC, !oldWindGenTurbineType1bIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindGenTurbineType1bIEC( NotificationChain msgs ) {
        WindGenTurbineType1bIEC oldWindGenTurbineType1bIEC = windGenTurbineType1bIEC;
        windGenTurbineType1bIEC = null;
        boolean oldWindGenTurbineType1bIECESet = windGenTurbineType1bIECESet;
        windGenTurbineType1bIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE1B_IEC, oldWindGenTurbineType1bIEC, null,
                    oldWindGenTurbineType1bIECESet );
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
    public void unsetWindGenTurbineType1bIEC() {
        if( windGenTurbineType1bIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windGenTurbineType1bIEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC__WIND_PITCH_CONT_POWER_IEC, WindGenTurbineType1bIEC.class,
                    msgs );
            msgs = basicUnsetWindGenTurbineType1bIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenTurbineType1bIECESet = windGenTurbineType1bIECESet;
            windGenTurbineType1bIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE1B_IEC, null, null,
                    oldWindGenTurbineType1bIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindGenTurbineType1bIEC() {
        return windGenTurbineType1bIECESet;
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
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWindDynamicsLookupTable() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE2_IEC:
            if( windGenTurbineType2IEC != null )
                msgs = ( ( InternalEObject ) windGenTurbineType2IEC ).eInverseRemove( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_PITCH_CONT_POWER_IEC, WindGenTurbineType2IEC.class,
                        msgs );
            return basicSetWindGenTurbineType2IEC( ( WindGenTurbineType2IEC ) otherEnd, msgs );
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE1B_IEC:
            if( windGenTurbineType1bIEC != null )
                msgs = ( ( InternalEObject ) windGenTurbineType1bIEC ).eInverseRemove( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC__WIND_PITCH_CONT_POWER_IEC,
                        WindGenTurbineType1bIEC.class, msgs );
            return basicSetWindGenTurbineType1bIEC( ( WindGenTurbineType1bIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return ( ( InternalEList< ? > ) getWindDynamicsLookupTable() ).basicRemove( otherEnd, msgs );
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE2_IEC:
            return basicUnsetWindGenTurbineType2IEC( msgs );
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE1B_IEC:
            return basicUnsetWindGenTurbineType1bIEC( msgs );
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
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__DPMAX:
            return getDpmax();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__DPMIN:
            return getDpmin();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__PMIN:
            return getPmin();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__PSET:
            return getPset();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__T1:
            return getT1();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__TR:
            return getTr();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__UUVRT:
            return getUuvrt();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return getWindDynamicsLookupTable();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE2_IEC:
            return getWindGenTurbineType2IEC();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE1B_IEC:
            return getWindGenTurbineType1bIEC();
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
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__DPMAX:
            setDpmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__DPMIN:
            setDpmin( ( Float ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__PMIN:
            setPmin( ( Float ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__PSET:
            setPset( ( Float ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__T1:
            setT1( ( Float ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__TR:
            setTr( ( Float ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__UUVRT:
            setUuvrt( ( Float ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            getWindDynamicsLookupTable().clear();
            getWindDynamicsLookupTable().addAll( ( Collection< ? extends WindDynamicsLookupTable > ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE2_IEC:
            setWindGenTurbineType2IEC( ( WindGenTurbineType2IEC ) newValue );
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE1B_IEC:
            setWindGenTurbineType1bIEC( ( WindGenTurbineType1bIEC ) newValue );
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
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__DPMAX:
            unsetDpmax();
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__DPMIN:
            unsetDpmin();
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__PMIN:
            unsetPmin();
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__PSET:
            unsetPset();
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__T1:
            unsetT1();
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__TR:
            unsetTr();
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__UUVRT:
            unsetUuvrt();
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            unsetWindDynamicsLookupTable();
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE2_IEC:
            unsetWindGenTurbineType2IEC();
            return;
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE1B_IEC:
            unsetWindGenTurbineType1bIEC();
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
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__DPMAX:
            return isSetDpmax();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__DPMIN:
            return isSetDpmin();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__PMIN:
            return isSetPmin();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__PSET:
            return isSetPset();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__T1:
            return isSetT1();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__TR:
            return isSetTr();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__UUVRT:
            return isSetUuvrt();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return isSetWindDynamicsLookupTable();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE2_IEC:
            return isSetWindGenTurbineType2IEC();
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE1B_IEC:
            return isSetWindGenTurbineType1bIEC();
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
        result.append( " (dpmax: " );
        if( dpmaxESet )
            result.append( dpmax );
        else
            result.append( "<unset>" );
        result.append( ", dpmin: " );
        if( dpminESet )
            result.append( dpmin );
        else
            result.append( "<unset>" );
        result.append( ", pmin: " );
        if( pminESet )
            result.append( pmin );
        else
            result.append( "<unset>" );
        result.append( ", pset: " );
        if( psetESet )
            result.append( pset );
        else
            result.append( "<unset>" );
        result.append( ", t1: " );
        if( t1ESet )
            result.append( t1 );
        else
            result.append( "<unset>" );
        result.append( ", tr: " );
        if( trESet )
            result.append( tr );
        else
            result.append( "<unset>" );
        result.append( ", uuvrt: " );
        if( uuvrtESet )
            result.append( uuvrt );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindPitchContPowerIECImpl
