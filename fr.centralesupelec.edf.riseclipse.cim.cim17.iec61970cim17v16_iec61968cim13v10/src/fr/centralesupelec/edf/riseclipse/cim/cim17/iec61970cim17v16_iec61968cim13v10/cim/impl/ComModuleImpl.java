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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule;

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
 * An implementation of the model object '<em><b>Com Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ComModuleImpl#getAmrSystem <em>Amr System</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ComModuleImpl#getSupportsAutonomousDst <em>Supports Autonomous Dst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ComModuleImpl#getTimeZoneOffset <em>Time Zone Offset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ComModuleImpl#getComFunctions <em>Com Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComModuleImpl extends AssetImpl implements ComModule {
    /**
     * The default value of the '{@link #getAmrSystem() <em>Amr System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmrSystem()
     * @generated
     * @ordered
     */
    protected static final String AMR_SYSTEM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAmrSystem() <em>Amr System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmrSystem()
     * @generated
     * @ordered
     */
    protected String amrSystem = AMR_SYSTEM_EDEFAULT;

    /**
     * This is true if the Amr System attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean amrSystemESet;

    /**
     * The default value of the '{@link #getSupportsAutonomousDst() <em>Supports Autonomous Dst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportsAutonomousDst()
     * @generated
     * @ordered
     */
    protected static final Boolean SUPPORTS_AUTONOMOUS_DST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSupportsAutonomousDst() <em>Supports Autonomous Dst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportsAutonomousDst()
     * @generated
     * @ordered
     */
    protected Boolean supportsAutonomousDst = SUPPORTS_AUTONOMOUS_DST_EDEFAULT;

    /**
     * This is true if the Supports Autonomous Dst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean supportsAutonomousDstESet;

    /**
     * The default value of the '{@link #getTimeZoneOffset() <em>Time Zone Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeZoneOffset()
     * @generated
     * @ordered
     */
    protected static final Float TIME_ZONE_OFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimeZoneOffset() <em>Time Zone Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeZoneOffset()
     * @generated
     * @ordered
     */
    protected Float timeZoneOffset = TIME_ZONE_OFFSET_EDEFAULT;

    /**
     * This is true if the Time Zone Offset attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeZoneOffsetESet;

    /**
     * The cached value of the '{@link #getComFunctions() <em>Com Functions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComFunctions()
     * @generated
     * @ordered
     */
    protected EList< ComFunction > comFunctions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComModuleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getComModule();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAmrSystem() {
        return amrSystem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAmrSystem( String newAmrSystem ) {
        String oldAmrSystem = amrSystem;
        amrSystem = newAmrSystem;
        boolean oldAmrSystemESet = amrSystemESet;
        amrSystemESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.COM_MODULE__AMR_SYSTEM, oldAmrSystem, amrSystem, !oldAmrSystemESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAmrSystem() {
        String oldAmrSystem = amrSystem;
        boolean oldAmrSystemESet = amrSystemESet;
        amrSystem = AMR_SYSTEM_EDEFAULT;
        amrSystemESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.COM_MODULE__AMR_SYSTEM, oldAmrSystem, AMR_SYSTEM_EDEFAULT, oldAmrSystemESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAmrSystem() {
        return amrSystemESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSupportsAutonomousDst() {
        return supportsAutonomousDst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSupportsAutonomousDst( Boolean newSupportsAutonomousDst ) {
        Boolean oldSupportsAutonomousDst = supportsAutonomousDst;
        supportsAutonomousDst = newSupportsAutonomousDst;
        boolean oldSupportsAutonomousDstESet = supportsAutonomousDstESet;
        supportsAutonomousDstESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.COM_MODULE__SUPPORTS_AUTONOMOUS_DST,
                    oldSupportsAutonomousDst, supportsAutonomousDst, !oldSupportsAutonomousDstESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSupportsAutonomousDst() {
        Boolean oldSupportsAutonomousDst = supportsAutonomousDst;
        boolean oldSupportsAutonomousDstESet = supportsAutonomousDstESet;
        supportsAutonomousDst = SUPPORTS_AUTONOMOUS_DST_EDEFAULT;
        supportsAutonomousDstESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.COM_MODULE__SUPPORTS_AUTONOMOUS_DST,
                    oldSupportsAutonomousDst, SUPPORTS_AUTONOMOUS_DST_EDEFAULT, oldSupportsAutonomousDstESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSupportsAutonomousDst() {
        return supportsAutonomousDstESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTimeZoneOffset() {
        return timeZoneOffset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTimeZoneOffset( Float newTimeZoneOffset ) {
        Float oldTimeZoneOffset = timeZoneOffset;
        timeZoneOffset = newTimeZoneOffset;
        boolean oldTimeZoneOffsetESet = timeZoneOffsetESet;
        timeZoneOffsetESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.COM_MODULE__TIME_ZONE_OFFSET, oldTimeZoneOffset, timeZoneOffset, !oldTimeZoneOffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimeZoneOffset() {
        Float oldTimeZoneOffset = timeZoneOffset;
        boolean oldTimeZoneOffsetESet = timeZoneOffsetESet;
        timeZoneOffset = TIME_ZONE_OFFSET_EDEFAULT;
        timeZoneOffsetESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.COM_MODULE__TIME_ZONE_OFFSET,
                    oldTimeZoneOffset, TIME_ZONE_OFFSET_EDEFAULT, oldTimeZoneOffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeZoneOffset() {
        return timeZoneOffsetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ComFunction > getComFunctions() {
        if( comFunctions == null ) {
            comFunctions = new EObjectWithInverseResolvingEList.Unsettable< ComFunction >( ComFunction.class, this,
                    CimPackage.COM_MODULE__COM_FUNCTIONS, CimPackage.COM_FUNCTION__COM_MODULE );
        }
        return comFunctions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetComFunctions() {
        if( comFunctions != null ) ( ( InternalEList.Unsettable< ? > ) comFunctions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetComFunctions() {
        return comFunctions != null && ( ( InternalEList.Unsettable< ? > ) comFunctions ).isSet();
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
        case CimPackage.COM_MODULE__COM_FUNCTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getComFunctions() ).basicAdd( otherEnd,
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
        case CimPackage.COM_MODULE__COM_FUNCTIONS:
            return ( ( InternalEList< ? > ) getComFunctions() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.COM_MODULE__AMR_SYSTEM:
            return getAmrSystem();
        case CimPackage.COM_MODULE__SUPPORTS_AUTONOMOUS_DST:
            return getSupportsAutonomousDst();
        case CimPackage.COM_MODULE__TIME_ZONE_OFFSET:
            return getTimeZoneOffset();
        case CimPackage.COM_MODULE__COM_FUNCTIONS:
            return getComFunctions();
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
        case CimPackage.COM_MODULE__AMR_SYSTEM:
            setAmrSystem( ( String ) newValue );
            return;
        case CimPackage.COM_MODULE__SUPPORTS_AUTONOMOUS_DST:
            setSupportsAutonomousDst( ( Boolean ) newValue );
            return;
        case CimPackage.COM_MODULE__TIME_ZONE_OFFSET:
            setTimeZoneOffset( ( Float ) newValue );
            return;
        case CimPackage.COM_MODULE__COM_FUNCTIONS:
            getComFunctions().clear();
            getComFunctions().addAll( ( Collection< ? extends ComFunction > ) newValue );
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
        case CimPackage.COM_MODULE__AMR_SYSTEM:
            unsetAmrSystem();
            return;
        case CimPackage.COM_MODULE__SUPPORTS_AUTONOMOUS_DST:
            unsetSupportsAutonomousDst();
            return;
        case CimPackage.COM_MODULE__TIME_ZONE_OFFSET:
            unsetTimeZoneOffset();
            return;
        case CimPackage.COM_MODULE__COM_FUNCTIONS:
            unsetComFunctions();
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
        case CimPackage.COM_MODULE__AMR_SYSTEM:
            return isSetAmrSystem();
        case CimPackage.COM_MODULE__SUPPORTS_AUTONOMOUS_DST:
            return isSetSupportsAutonomousDst();
        case CimPackage.COM_MODULE__TIME_ZONE_OFFSET:
            return isSetTimeZoneOffset();
        case CimPackage.COM_MODULE__COM_FUNCTIONS:
            return isSetComFunctions();
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
        result.append( " (amrSystem: " );
        if( amrSystemESet )
            result.append( amrSystem );
        else
            result.append( "<unset>" );
        result.append( ", supportsAutonomousDst: " );
        if( supportsAutonomousDstESet )
            result.append( supportsAutonomousDst );
        else
            result.append( "<unset>" );
        result.append( ", timeZoneOffset: " );
        if( timeZoneOffsetESet )
            result.append( timeZoneOffset );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ComModuleImpl
