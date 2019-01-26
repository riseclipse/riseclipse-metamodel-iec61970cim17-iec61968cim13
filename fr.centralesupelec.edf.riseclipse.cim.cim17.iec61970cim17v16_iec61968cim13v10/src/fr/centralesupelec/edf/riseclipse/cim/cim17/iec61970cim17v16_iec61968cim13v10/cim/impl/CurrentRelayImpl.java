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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Relay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CurrentRelayImpl#getCurrentLimit1 <em>Current Limit1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CurrentRelayImpl#getCurrentLimit2 <em>Current Limit2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CurrentRelayImpl#getCurrentLimit3 <em>Current Limit3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CurrentRelayImpl#getInverseTimeFlag <em>Inverse Time Flag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CurrentRelayImpl#getTimeDelay1 <em>Time Delay1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CurrentRelayImpl#getTimeDelay2 <em>Time Delay2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CurrentRelayImpl#getTimeDelay3 <em>Time Delay3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrentRelayImpl extends ProtectionEquipmentImpl implements CurrentRelay {
    /**
     * The default value of the '{@link #getCurrentLimit1() <em>Current Limit1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentLimit1()
     * @generated
     * @ordered
     */
    protected static final Float CURRENT_LIMIT1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCurrentLimit1() <em>Current Limit1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentLimit1()
     * @generated
     * @ordered
     */
    protected Float currentLimit1 = CURRENT_LIMIT1_EDEFAULT;

    /**
     * This is true if the Current Limit1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean currentLimit1ESet;

    /**
     * The default value of the '{@link #getCurrentLimit2() <em>Current Limit2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentLimit2()
     * @generated
     * @ordered
     */
    protected static final Float CURRENT_LIMIT2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCurrentLimit2() <em>Current Limit2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentLimit2()
     * @generated
     * @ordered
     */
    protected Float currentLimit2 = CURRENT_LIMIT2_EDEFAULT;

    /**
     * This is true if the Current Limit2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean currentLimit2ESet;

    /**
     * The default value of the '{@link #getCurrentLimit3() <em>Current Limit3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentLimit3()
     * @generated
     * @ordered
     */
    protected static final Float CURRENT_LIMIT3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCurrentLimit3() <em>Current Limit3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentLimit3()
     * @generated
     * @ordered
     */
    protected Float currentLimit3 = CURRENT_LIMIT3_EDEFAULT;

    /**
     * This is true if the Current Limit3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean currentLimit3ESet;

    /**
     * The default value of the '{@link #getInverseTimeFlag() <em>Inverse Time Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInverseTimeFlag()
     * @generated
     * @ordered
     */
    protected static final Boolean INVERSE_TIME_FLAG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInverseTimeFlag() <em>Inverse Time Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInverseTimeFlag()
     * @generated
     * @ordered
     */
    protected Boolean inverseTimeFlag = INVERSE_TIME_FLAG_EDEFAULT;

    /**
     * This is true if the Inverse Time Flag attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inverseTimeFlagESet;

    /**
     * The default value of the '{@link #getTimeDelay1() <em>Time Delay1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeDelay1()
     * @generated
     * @ordered
     */
    protected static final Float TIME_DELAY1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimeDelay1() <em>Time Delay1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeDelay1()
     * @generated
     * @ordered
     */
    protected Float timeDelay1 = TIME_DELAY1_EDEFAULT;

    /**
     * This is true if the Time Delay1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeDelay1ESet;

    /**
     * The default value of the '{@link #getTimeDelay2() <em>Time Delay2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeDelay2()
     * @generated
     * @ordered
     */
    protected static final Float TIME_DELAY2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimeDelay2() <em>Time Delay2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeDelay2()
     * @generated
     * @ordered
     */
    protected Float timeDelay2 = TIME_DELAY2_EDEFAULT;

    /**
     * This is true if the Time Delay2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeDelay2ESet;

    /**
     * The default value of the '{@link #getTimeDelay3() <em>Time Delay3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeDelay3()
     * @generated
     * @ordered
     */
    protected static final Float TIME_DELAY3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimeDelay3() <em>Time Delay3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeDelay3()
     * @generated
     * @ordered
     */
    protected Float timeDelay3 = TIME_DELAY3_EDEFAULT;

    /**
     * This is true if the Time Delay3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeDelay3ESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CurrentRelayImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCurrentRelay();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCurrentLimit1() {
        return currentLimit1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCurrentLimit1( Float newCurrentLimit1 ) {
        Float oldCurrentLimit1 = currentLimit1;
        currentLimit1 = newCurrentLimit1;
        boolean oldCurrentLimit1ESet = currentLimit1ESet;
        currentLimit1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CURRENT_RELAY__CURRENT_LIMIT1, oldCurrentLimit1, currentLimit1, !oldCurrentLimit1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCurrentLimit1() {
        Float oldCurrentLimit1 = currentLimit1;
        boolean oldCurrentLimit1ESet = currentLimit1ESet;
        currentLimit1 = CURRENT_LIMIT1_EDEFAULT;
        currentLimit1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CURRENT_RELAY__CURRENT_LIMIT1,
                    oldCurrentLimit1, CURRENT_LIMIT1_EDEFAULT, oldCurrentLimit1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCurrentLimit1() {
        return currentLimit1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCurrentLimit2() {
        return currentLimit2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCurrentLimit2( Float newCurrentLimit2 ) {
        Float oldCurrentLimit2 = currentLimit2;
        currentLimit2 = newCurrentLimit2;
        boolean oldCurrentLimit2ESet = currentLimit2ESet;
        currentLimit2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CURRENT_RELAY__CURRENT_LIMIT2, oldCurrentLimit2, currentLimit2, !oldCurrentLimit2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCurrentLimit2() {
        Float oldCurrentLimit2 = currentLimit2;
        boolean oldCurrentLimit2ESet = currentLimit2ESet;
        currentLimit2 = CURRENT_LIMIT2_EDEFAULT;
        currentLimit2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CURRENT_RELAY__CURRENT_LIMIT2,
                    oldCurrentLimit2, CURRENT_LIMIT2_EDEFAULT, oldCurrentLimit2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCurrentLimit2() {
        return currentLimit2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCurrentLimit3() {
        return currentLimit3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCurrentLimit3( Float newCurrentLimit3 ) {
        Float oldCurrentLimit3 = currentLimit3;
        currentLimit3 = newCurrentLimit3;
        boolean oldCurrentLimit3ESet = currentLimit3ESet;
        currentLimit3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CURRENT_RELAY__CURRENT_LIMIT3, oldCurrentLimit3, currentLimit3, !oldCurrentLimit3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCurrentLimit3() {
        Float oldCurrentLimit3 = currentLimit3;
        boolean oldCurrentLimit3ESet = currentLimit3ESet;
        currentLimit3 = CURRENT_LIMIT3_EDEFAULT;
        currentLimit3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CURRENT_RELAY__CURRENT_LIMIT3,
                    oldCurrentLimit3, CURRENT_LIMIT3_EDEFAULT, oldCurrentLimit3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCurrentLimit3() {
        return currentLimit3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getInverseTimeFlag() {
        return inverseTimeFlag;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInverseTimeFlag( Boolean newInverseTimeFlag ) {
        Boolean oldInverseTimeFlag = inverseTimeFlag;
        inverseTimeFlag = newInverseTimeFlag;
        boolean oldInverseTimeFlagESet = inverseTimeFlagESet;
        inverseTimeFlagESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CURRENT_RELAY__INVERSE_TIME_FLAG,
                    oldInverseTimeFlag, inverseTimeFlag, !oldInverseTimeFlagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInverseTimeFlag() {
        Boolean oldInverseTimeFlag = inverseTimeFlag;
        boolean oldInverseTimeFlagESet = inverseTimeFlagESet;
        inverseTimeFlag = INVERSE_TIME_FLAG_EDEFAULT;
        inverseTimeFlagESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CURRENT_RELAY__INVERSE_TIME_FLAG,
                    oldInverseTimeFlag, INVERSE_TIME_FLAG_EDEFAULT, oldInverseTimeFlagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInverseTimeFlag() {
        return inverseTimeFlagESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTimeDelay1() {
        return timeDelay1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTimeDelay1( Float newTimeDelay1 ) {
        Float oldTimeDelay1 = timeDelay1;
        timeDelay1 = newTimeDelay1;
        boolean oldTimeDelay1ESet = timeDelay1ESet;
        timeDelay1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CURRENT_RELAY__TIME_DELAY1, oldTimeDelay1, timeDelay1, !oldTimeDelay1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimeDelay1() {
        Float oldTimeDelay1 = timeDelay1;
        boolean oldTimeDelay1ESet = timeDelay1ESet;
        timeDelay1 = TIME_DELAY1_EDEFAULT;
        timeDelay1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CURRENT_RELAY__TIME_DELAY1, oldTimeDelay1, TIME_DELAY1_EDEFAULT, oldTimeDelay1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeDelay1() {
        return timeDelay1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTimeDelay2() {
        return timeDelay2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTimeDelay2( Float newTimeDelay2 ) {
        Float oldTimeDelay2 = timeDelay2;
        timeDelay2 = newTimeDelay2;
        boolean oldTimeDelay2ESet = timeDelay2ESet;
        timeDelay2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CURRENT_RELAY__TIME_DELAY2, oldTimeDelay2, timeDelay2, !oldTimeDelay2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimeDelay2() {
        Float oldTimeDelay2 = timeDelay2;
        boolean oldTimeDelay2ESet = timeDelay2ESet;
        timeDelay2 = TIME_DELAY2_EDEFAULT;
        timeDelay2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CURRENT_RELAY__TIME_DELAY2, oldTimeDelay2, TIME_DELAY2_EDEFAULT, oldTimeDelay2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeDelay2() {
        return timeDelay2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTimeDelay3() {
        return timeDelay3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTimeDelay3( Float newTimeDelay3 ) {
        Float oldTimeDelay3 = timeDelay3;
        timeDelay3 = newTimeDelay3;
        boolean oldTimeDelay3ESet = timeDelay3ESet;
        timeDelay3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CURRENT_RELAY__TIME_DELAY3, oldTimeDelay3, timeDelay3, !oldTimeDelay3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimeDelay3() {
        Float oldTimeDelay3 = timeDelay3;
        boolean oldTimeDelay3ESet = timeDelay3ESet;
        timeDelay3 = TIME_DELAY3_EDEFAULT;
        timeDelay3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CURRENT_RELAY__TIME_DELAY3, oldTimeDelay3, TIME_DELAY3_EDEFAULT, oldTimeDelay3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeDelay3() {
        return timeDelay3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.CURRENT_RELAY__CURRENT_LIMIT1:
            return getCurrentLimit1();
        case CimPackage.CURRENT_RELAY__CURRENT_LIMIT2:
            return getCurrentLimit2();
        case CimPackage.CURRENT_RELAY__CURRENT_LIMIT3:
            return getCurrentLimit3();
        case CimPackage.CURRENT_RELAY__INVERSE_TIME_FLAG:
            return getInverseTimeFlag();
        case CimPackage.CURRENT_RELAY__TIME_DELAY1:
            return getTimeDelay1();
        case CimPackage.CURRENT_RELAY__TIME_DELAY2:
            return getTimeDelay2();
        case CimPackage.CURRENT_RELAY__TIME_DELAY3:
            return getTimeDelay3();
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
        case CimPackage.CURRENT_RELAY__CURRENT_LIMIT1:
            setCurrentLimit1( ( Float ) newValue );
            return;
        case CimPackage.CURRENT_RELAY__CURRENT_LIMIT2:
            setCurrentLimit2( ( Float ) newValue );
            return;
        case CimPackage.CURRENT_RELAY__CURRENT_LIMIT3:
            setCurrentLimit3( ( Float ) newValue );
            return;
        case CimPackage.CURRENT_RELAY__INVERSE_TIME_FLAG:
            setInverseTimeFlag( ( Boolean ) newValue );
            return;
        case CimPackage.CURRENT_RELAY__TIME_DELAY1:
            setTimeDelay1( ( Float ) newValue );
            return;
        case CimPackage.CURRENT_RELAY__TIME_DELAY2:
            setTimeDelay2( ( Float ) newValue );
            return;
        case CimPackage.CURRENT_RELAY__TIME_DELAY3:
            setTimeDelay3( ( Float ) newValue );
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
        case CimPackage.CURRENT_RELAY__CURRENT_LIMIT1:
            unsetCurrentLimit1();
            return;
        case CimPackage.CURRENT_RELAY__CURRENT_LIMIT2:
            unsetCurrentLimit2();
            return;
        case CimPackage.CURRENT_RELAY__CURRENT_LIMIT3:
            unsetCurrentLimit3();
            return;
        case CimPackage.CURRENT_RELAY__INVERSE_TIME_FLAG:
            unsetInverseTimeFlag();
            return;
        case CimPackage.CURRENT_RELAY__TIME_DELAY1:
            unsetTimeDelay1();
            return;
        case CimPackage.CURRENT_RELAY__TIME_DELAY2:
            unsetTimeDelay2();
            return;
        case CimPackage.CURRENT_RELAY__TIME_DELAY3:
            unsetTimeDelay3();
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
        case CimPackage.CURRENT_RELAY__CURRENT_LIMIT1:
            return isSetCurrentLimit1();
        case CimPackage.CURRENT_RELAY__CURRENT_LIMIT2:
            return isSetCurrentLimit2();
        case CimPackage.CURRENT_RELAY__CURRENT_LIMIT3:
            return isSetCurrentLimit3();
        case CimPackage.CURRENT_RELAY__INVERSE_TIME_FLAG:
            return isSetInverseTimeFlag();
        case CimPackage.CURRENT_RELAY__TIME_DELAY1:
            return isSetTimeDelay1();
        case CimPackage.CURRENT_RELAY__TIME_DELAY2:
            return isSetTimeDelay2();
        case CimPackage.CURRENT_RELAY__TIME_DELAY3:
            return isSetTimeDelay3();
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
        result.append( " (currentLimit1: " );
        if( currentLimit1ESet )
            result.append( currentLimit1 );
        else
            result.append( "<unset>" );
        result.append( ", currentLimit2: " );
        if( currentLimit2ESet )
            result.append( currentLimit2 );
        else
            result.append( "<unset>" );
        result.append( ", currentLimit3: " );
        if( currentLimit3ESet )
            result.append( currentLimit3 );
        else
            result.append( "<unset>" );
        result.append( ", inverseTimeFlag: " );
        if( inverseTimeFlagESet )
            result.append( inverseTimeFlag );
        else
            result.append( "<unset>" );
        result.append( ", timeDelay1: " );
        if( timeDelay1ESet )
            result.append( timeDelay1 );
        else
            result.append( "<unset>" );
        result.append( ", timeDelay2: " );
        if( timeDelay2ESet )
            result.append( timeDelay2 );
        else
            result.append( "<unset>" );
        result.append( ", timeDelay3: " );
        if( timeDelay3ESet )
            result.append( timeDelay3 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CurrentRelayImpl
