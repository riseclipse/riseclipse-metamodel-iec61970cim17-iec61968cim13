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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType2;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen ICompensation For Gen J</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GenICompensationForGenJImpl#getRcij <em>Rcij</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GenICompensationForGenJImpl#getXcij <em>Xcij</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GenICompensationForGenJImpl#getVcompIEEEType2 <em>Vcomp IEEE Type2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GenICompensationForGenJImpl#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenICompensationForGenJImpl extends IdentifiedObjectImpl implements GenICompensationForGenJ {
    /**
     * The default value of the '{@link #getRcij() <em>Rcij</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRcij()
     * @generated
     * @ordered
     */
    protected static final Float RCIJ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRcij() <em>Rcij</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRcij()
     * @generated
     * @ordered
     */
    protected Float rcij = RCIJ_EDEFAULT;

    /**
     * This is true if the Rcij attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rcijESet;

    /**
     * The default value of the '{@link #getXcij() <em>Xcij</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXcij()
     * @generated
     * @ordered
     */
    protected static final Float XCIJ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXcij() <em>Xcij</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXcij()
     * @generated
     * @ordered
     */
    protected Float xcij = XCIJ_EDEFAULT;

    /**
     * This is true if the Xcij attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xcijESet;

    /**
     * The cached value of the '{@link #getVcompIEEEType2() <em>Vcomp IEEE Type2</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVcompIEEEType2()
     * @generated
     * @ordered
     */
    protected VCompIEEEType2 vcompIEEEType2;

    /**
     * This is true if the Vcomp IEEE Type2 reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vcompIEEEType2ESet;

    /**
     * The cached value of the '{@link #getSynchronousMachineDynamics() <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSynchronousMachineDynamics()
     * @generated
     * @ordered
     */
    protected SynchronousMachineDynamics synchronousMachineDynamics;

    /**
     * This is true if the Synchronous Machine Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean synchronousMachineDynamicsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GenICompensationForGenJImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGenICompensationForGenJ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRcij() {
        return rcij;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRcij( Float newRcij ) {
        Float oldRcij = rcij;
        rcij = newRcij;
        boolean oldRcijESet = rcijESet;
        rcijESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__RCIJ, oldRcij, rcij, !oldRcijESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRcij() {
        Float oldRcij = rcij;
        boolean oldRcijESet = rcijESet;
        rcij = RCIJ_EDEFAULT;
        rcijESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__RCIJ, oldRcij, RCIJ_EDEFAULT, oldRcijESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRcij() {
        return rcijESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXcij() {
        return xcij;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXcij( Float newXcij ) {
        Float oldXcij = xcij;
        xcij = newXcij;
        boolean oldXcijESet = xcijESet;
        xcijESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__XCIJ, oldXcij, xcij, !oldXcijESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXcij() {
        Float oldXcij = xcij;
        boolean oldXcijESet = xcijESet;
        xcij = XCIJ_EDEFAULT;
        xcijESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__XCIJ, oldXcij, XCIJ_EDEFAULT, oldXcijESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXcij() {
        return xcijESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VCompIEEEType2 getVcompIEEEType2() {
        return vcompIEEEType2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVcompIEEEType2( VCompIEEEType2 newVcompIEEEType2, NotificationChain msgs ) {
        VCompIEEEType2 oldVcompIEEEType2 = vcompIEEEType2;
        vcompIEEEType2 = newVcompIEEEType2;
        boolean oldVcompIEEEType2ESet = vcompIEEEType2ESet;
        vcompIEEEType2ESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__VCOMP_IEEE_TYPE2, oldVcompIEEEType2, newVcompIEEEType2,
                    !oldVcompIEEEType2ESet );
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
    public void setVcompIEEEType2( VCompIEEEType2 newVcompIEEEType2 ) {
        if( newVcompIEEEType2 != vcompIEEEType2 ) {
            NotificationChain msgs = null;
            if( vcompIEEEType2 != null ) msgs = ( ( InternalEObject ) vcompIEEEType2 ).eInverseRemove( this,
                    CimPackage.VCOMP_IEEE_TYPE2__GEN_ICOMPENSATION_FOR_GEN_J, VCompIEEEType2.class, msgs );
            if( newVcompIEEEType2 != null ) msgs = ( ( InternalEObject ) newVcompIEEEType2 ).eInverseAdd( this,
                    CimPackage.VCOMP_IEEE_TYPE2__GEN_ICOMPENSATION_FOR_GEN_J, VCompIEEEType2.class, msgs );
            msgs = basicSetVcompIEEEType2( newVcompIEEEType2, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVcompIEEEType2ESet = vcompIEEEType2ESet;
            vcompIEEEType2ESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__VCOMP_IEEE_TYPE2, newVcompIEEEType2, newVcompIEEEType2,
                    !oldVcompIEEEType2ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetVcompIEEEType2( NotificationChain msgs ) {
        VCompIEEEType2 oldVcompIEEEType2 = vcompIEEEType2;
        vcompIEEEType2 = null;
        boolean oldVcompIEEEType2ESet = vcompIEEEType2ESet;
        vcompIEEEType2ESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__VCOMP_IEEE_TYPE2, oldVcompIEEEType2, null,
                    oldVcompIEEEType2ESet );
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
    public void unsetVcompIEEEType2() {
        if( vcompIEEEType2 != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) vcompIEEEType2 ).eInverseRemove( this,
                    CimPackage.VCOMP_IEEE_TYPE2__GEN_ICOMPENSATION_FOR_GEN_J, VCompIEEEType2.class, msgs );
            msgs = basicUnsetVcompIEEEType2( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVcompIEEEType2ESet = vcompIEEEType2ESet;
            vcompIEEEType2ESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__VCOMP_IEEE_TYPE2, null, null, oldVcompIEEEType2ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVcompIEEEType2() {
        return vcompIEEEType2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineDynamics getSynchronousMachineDynamics() {
        return synchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSynchronousMachineDynamics(
            SynchronousMachineDynamics newSynchronousMachineDynamics, NotificationChain msgs ) {
        SynchronousMachineDynamics oldSynchronousMachineDynamics = synchronousMachineDynamics;
        synchronousMachineDynamics = newSynchronousMachineDynamics;
        boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
        synchronousMachineDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__SYNCHRONOUS_MACHINE_DYNAMICS, oldSynchronousMachineDynamics,
                    newSynchronousMachineDynamics, !oldSynchronousMachineDynamicsESet );
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
    public void setSynchronousMachineDynamics( SynchronousMachineDynamics newSynchronousMachineDynamics ) {
        if( newSynchronousMachineDynamics != synchronousMachineDynamics ) {
            NotificationChain msgs = null;
            if( synchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) synchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J,
                        SynchronousMachineDynamics.class, msgs );
            if( newSynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) newSynchronousMachineDynamics ).eInverseAdd( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J,
                        SynchronousMachineDynamics.class, msgs );
            msgs = basicSetSynchronousMachineDynamics( newSynchronousMachineDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
            synchronousMachineDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__SYNCHRONOUS_MACHINE_DYNAMICS, newSynchronousMachineDynamics,
                    newSynchronousMachineDynamics, !oldSynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSynchronousMachineDynamics( NotificationChain msgs ) {
        SynchronousMachineDynamics oldSynchronousMachineDynamics = synchronousMachineDynamics;
        synchronousMachineDynamics = null;
        boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
        synchronousMachineDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__SYNCHRONOUS_MACHINE_DYNAMICS, oldSynchronousMachineDynamics,
                    null, oldSynchronousMachineDynamicsESet );
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
    public void unsetSynchronousMachineDynamics() {
        if( synchronousMachineDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) synchronousMachineDynamics ).eInverseRemove( this,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J,
                    SynchronousMachineDynamics.class, msgs );
            msgs = basicUnsetSynchronousMachineDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
            synchronousMachineDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__SYNCHRONOUS_MACHINE_DYNAMICS, null, null,
                    oldSynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSynchronousMachineDynamics() {
        return synchronousMachineDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__VCOMP_IEEE_TYPE2:
            if( vcompIEEEType2 != null ) msgs = ( ( InternalEObject ) vcompIEEEType2 ).eInverseRemove( this,
                    CimPackage.VCOMP_IEEE_TYPE2__GEN_ICOMPENSATION_FOR_GEN_J, VCompIEEEType2.class, msgs );
            return basicSetVcompIEEEType2( ( VCompIEEEType2 ) otherEnd, msgs );
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__SYNCHRONOUS_MACHINE_DYNAMICS:
            if( synchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) synchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J,
                        SynchronousMachineDynamics.class, msgs );
            return basicSetSynchronousMachineDynamics( ( SynchronousMachineDynamics ) otherEnd, msgs );
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
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__VCOMP_IEEE_TYPE2:
            return basicUnsetVcompIEEEType2( msgs );
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__SYNCHRONOUS_MACHINE_DYNAMICS:
            return basicUnsetSynchronousMachineDynamics( msgs );
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
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__RCIJ:
            return getRcij();
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__XCIJ:
            return getXcij();
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__VCOMP_IEEE_TYPE2:
            return getVcompIEEEType2();
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__SYNCHRONOUS_MACHINE_DYNAMICS:
            return getSynchronousMachineDynamics();
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
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__RCIJ:
            setRcij( ( Float ) newValue );
            return;
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__XCIJ:
            setXcij( ( Float ) newValue );
            return;
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__VCOMP_IEEE_TYPE2:
            setVcompIEEEType2( ( VCompIEEEType2 ) newValue );
            return;
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__SYNCHRONOUS_MACHINE_DYNAMICS:
            setSynchronousMachineDynamics( ( SynchronousMachineDynamics ) newValue );
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
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__RCIJ:
            unsetRcij();
            return;
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__XCIJ:
            unsetXcij();
            return;
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__VCOMP_IEEE_TYPE2:
            unsetVcompIEEEType2();
            return;
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__SYNCHRONOUS_MACHINE_DYNAMICS:
            unsetSynchronousMachineDynamics();
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
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__RCIJ:
            return isSetRcij();
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__XCIJ:
            return isSetXcij();
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__VCOMP_IEEE_TYPE2:
            return isSetVcompIEEEType2();
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__SYNCHRONOUS_MACHINE_DYNAMICS:
            return isSetSynchronousMachineDynamics();
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
        result.append( " (rcij: " );
        if( rcijESet )
            result.append( rcij );
        else
            result.append( "<unset>" );
        result.append( ", xcij: " );
        if( xcijESet )
            result.append( xcij );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GenICompensationForGenJImpl
