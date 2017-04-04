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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CompositeSwitch;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchSchedule;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchImpl#getNormalOpen <em>Normal Open</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchImpl#getOpen <em>Open</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchImpl#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchImpl#getRetained <em>Retained</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchImpl#getSwitchOnCount <em>Switch On Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchImpl#getSwitchOnDate <em>Switch On Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchImpl#getSwitchSchedules <em>Switch Schedules</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchImpl#getCompositeSwitch <em>Composite Switch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchImpl#getOutage <em>Outage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchImpl#getSwitchAction <em>Switch Action</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchImpl#getConnectDisconnectFunctions <em>Connect Disconnect Functions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchImpl#getSwitchPhase <em>Switch Phase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchImpl extends ConductingEquipmentImpl implements Switch {
    /**
     * The default value of the '{@link #getNormalOpen() <em>Normal Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalOpen()
     * @generated
     * @ordered
     */
    protected static final Boolean NORMAL_OPEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNormalOpen() <em>Normal Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalOpen()
     * @generated
     * @ordered
     */
    protected Boolean normalOpen = NORMAL_OPEN_EDEFAULT;

    /**
     * This is true if the Normal Open attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean normalOpenESet;

    /**
     * The default value of the '{@link #getOpen() <em>Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpen()
     * @generated
     * @ordered
     */
    protected static final Boolean OPEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOpen() <em>Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpen()
     * @generated
     * @ordered
     */
    protected Boolean open = OPEN_EDEFAULT;

    /**
     * This is true if the Open attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean openESet;

    /**
     * The default value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedCurrent()
     * @generated
     * @ordered
     */
    protected static final Float RATED_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedCurrent()
     * @generated
     * @ordered
     */
    protected Float ratedCurrent = RATED_CURRENT_EDEFAULT;

    /**
     * This is true if the Rated Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedCurrentESet;

    /**
     * The default value of the '{@link #getRetained() <em>Retained</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRetained()
     * @generated
     * @ordered
     */
    protected static final Boolean RETAINED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRetained() <em>Retained</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRetained()
     * @generated
     * @ordered
     */
    protected Boolean retained = RETAINED_EDEFAULT;

    /**
     * This is true if the Retained attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean retainedESet;

    /**
     * The default value of the '{@link #getSwitchOnCount() <em>Switch On Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchOnCount()
     * @generated
     * @ordered
     */
    protected static final Integer SWITCH_ON_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSwitchOnCount() <em>Switch On Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchOnCount()
     * @generated
     * @ordered
     */
    protected Integer switchOnCount = SWITCH_ON_COUNT_EDEFAULT;

    /**
     * This is true if the Switch On Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean switchOnCountESet;

    /**
     * The default value of the '{@link #getSwitchOnDate() <em>Switch On Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchOnDate()
     * @generated
     * @ordered
     */
    protected static final Date SWITCH_ON_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSwitchOnDate() <em>Switch On Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchOnDate()
     * @generated
     * @ordered
     */
    protected Date switchOnDate = SWITCH_ON_DATE_EDEFAULT;

    /**
     * This is true if the Switch On Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean switchOnDateESet;

    /**
     * The cached value of the '{@link #getSwitchSchedules() <em>Switch Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchSchedules()
     * @generated
     * @ordered
     */
    protected EList< SwitchSchedule > switchSchedules;

    /**
     * The cached value of the '{@link #getCompositeSwitch() <em>Composite Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCompositeSwitch()
     * @generated
     * @ordered
     */
    protected CompositeSwitch compositeSwitch;

    /**
     * This is true if the Composite Switch reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean compositeSwitchESet;

    /**
     * The cached value of the '{@link #getOutage() <em>Outage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutage()
     * @generated
     * @ordered
     */
    protected Outage outage;

    /**
     * This is true if the Outage reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outageESet;

    /**
     * The cached value of the '{@link #getSwitchAction() <em>Switch Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchAction()
     * @generated
     * @ordered
     */
    protected SwitchAction switchAction;

    /**
     * This is true if the Switch Action reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean switchActionESet;

    /**
     * The cached value of the '{@link #getConnectDisconnectFunctions() <em>Connect Disconnect Functions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectDisconnectFunctions()
     * @generated
     * @ordered
     */
    protected EList< ConnectDisconnectFunction > connectDisconnectFunctions;

    /**
     * The cached value of the '{@link #getSwitchPhase() <em>Switch Phase</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchPhase()
     * @generated
     * @ordered
     */
    protected EList< SwitchPhase > switchPhase;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSwitch();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getNormalOpen() {
        return normalOpen;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNormalOpen( Boolean newNormalOpen ) {
        Boolean oldNormalOpen = normalOpen;
        normalOpen = newNormalOpen;
        boolean oldNormalOpenESet = normalOpenESet;
        normalOpenESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH__NORMAL_OPEN, oldNormalOpen, normalOpen, !oldNormalOpenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNormalOpen() {
        Boolean oldNormalOpen = normalOpen;
        boolean oldNormalOpenESet = normalOpenESet;
        normalOpen = NORMAL_OPEN_EDEFAULT;
        normalOpenESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH__NORMAL_OPEN, oldNormalOpen, NORMAL_OPEN_EDEFAULT, oldNormalOpenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNormalOpen() {
        return normalOpenESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getOpen() {
        return open;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOpen( Boolean newOpen ) {
        Boolean oldOpen = open;
        open = newOpen;
        boolean oldOpenESet = openESet;
        openESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH__OPEN, oldOpen, open, !oldOpenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOpen() {
        Boolean oldOpen = open;
        boolean oldOpenESet = openESet;
        open = OPEN_EDEFAULT;
        openESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH__OPEN,
                oldOpen, OPEN_EDEFAULT, oldOpenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOpen() {
        return openESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedCurrent() {
        return ratedCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedCurrent( Float newRatedCurrent ) {
        Float oldRatedCurrent = ratedCurrent;
        ratedCurrent = newRatedCurrent;
        boolean oldRatedCurrentESet = ratedCurrentESet;
        ratedCurrentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH__RATED_CURRENT, oldRatedCurrent, ratedCurrent, !oldRatedCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedCurrent() {
        Float oldRatedCurrent = ratedCurrent;
        boolean oldRatedCurrentESet = ratedCurrentESet;
        ratedCurrent = RATED_CURRENT_EDEFAULT;
        ratedCurrentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH__RATED_CURRENT, oldRatedCurrent, RATED_CURRENT_EDEFAULT, oldRatedCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedCurrent() {
        return ratedCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getRetained() {
        return retained;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRetained( Boolean newRetained ) {
        Boolean oldRetained = retained;
        retained = newRetained;
        boolean oldRetainedESet = retainedESet;
        retainedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH__RETAINED, oldRetained, retained, !oldRetainedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRetained() {
        Boolean oldRetained = retained;
        boolean oldRetainedESet = retainedESet;
        retained = RETAINED_EDEFAULT;
        retainedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH__RETAINED, oldRetained, RETAINED_EDEFAULT, oldRetainedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRetained() {
        return retainedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getSwitchOnCount() {
        return switchOnCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSwitchOnCount( Integer newSwitchOnCount ) {
        Integer oldSwitchOnCount = switchOnCount;
        switchOnCount = newSwitchOnCount;
        boolean oldSwitchOnCountESet = switchOnCountESet;
        switchOnCountESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH__SWITCH_ON_COUNT, oldSwitchOnCount, switchOnCount, !oldSwitchOnCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSwitchOnCount() {
        Integer oldSwitchOnCount = switchOnCount;
        boolean oldSwitchOnCountESet = switchOnCountESet;
        switchOnCount = SWITCH_ON_COUNT_EDEFAULT;
        switchOnCountESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH__SWITCH_ON_COUNT,
                    oldSwitchOnCount, SWITCH_ON_COUNT_EDEFAULT, oldSwitchOnCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchOnCount() {
        return switchOnCountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getSwitchOnDate() {
        return switchOnDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSwitchOnDate( Date newSwitchOnDate ) {
        Date oldSwitchOnDate = switchOnDate;
        switchOnDate = newSwitchOnDate;
        boolean oldSwitchOnDateESet = switchOnDateESet;
        switchOnDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH__SWITCH_ON_DATE, oldSwitchOnDate, switchOnDate, !oldSwitchOnDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSwitchOnDate() {
        Date oldSwitchOnDate = switchOnDate;
        boolean oldSwitchOnDateESet = switchOnDateESet;
        switchOnDate = SWITCH_ON_DATE_EDEFAULT;
        switchOnDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH__SWITCH_ON_DATE, oldSwitchOnDate, SWITCH_ON_DATE_EDEFAULT, oldSwitchOnDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchOnDate() {
        return switchOnDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SwitchSchedule > getSwitchSchedules() {
        if( switchSchedules == null ) {
            switchSchedules = new EObjectWithInverseResolvingEList.Unsettable< SwitchSchedule >( SwitchSchedule.class,
                    this, CimPackage.SWITCH__SWITCH_SCHEDULES, CimPackage.SWITCH_SCHEDULE__SWITCH );
        }
        return switchSchedules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSwitchSchedules() {
        if( switchSchedules != null ) ( ( InternalEList.Unsettable< ? > ) switchSchedules ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchSchedules() {
        return switchSchedules != null && ( ( InternalEList.Unsettable< ? > ) switchSchedules ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CompositeSwitch getCompositeSwitch() {
        return compositeSwitch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCompositeSwitch( CompositeSwitch newCompositeSwitch, NotificationChain msgs ) {
        CompositeSwitch oldCompositeSwitch = compositeSwitch;
        compositeSwitch = newCompositeSwitch;
        boolean oldCompositeSwitchESet = compositeSwitchESet;
        compositeSwitchESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCH__COMPOSITE_SWITCH, oldCompositeSwitch, newCompositeSwitch,
                    !oldCompositeSwitchESet );
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
    public void setCompositeSwitch( CompositeSwitch newCompositeSwitch ) {
        if( newCompositeSwitch != compositeSwitch ) {
            NotificationChain msgs = null;
            if( compositeSwitch != null ) msgs = ( ( InternalEObject ) compositeSwitch ).eInverseRemove( this,
                    CimPackage.COMPOSITE_SWITCH__SWITCHES, CompositeSwitch.class, msgs );
            if( newCompositeSwitch != null ) msgs = ( ( InternalEObject ) newCompositeSwitch ).eInverseAdd( this,
                    CimPackage.COMPOSITE_SWITCH__SWITCHES, CompositeSwitch.class, msgs );
            msgs = basicSetCompositeSwitch( newCompositeSwitch, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCompositeSwitchESet = compositeSwitchESet;
            compositeSwitchESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH__COMPOSITE_SWITCH,
                        newCompositeSwitch, newCompositeSwitch, !oldCompositeSwitchESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCompositeSwitch( NotificationChain msgs ) {
        CompositeSwitch oldCompositeSwitch = compositeSwitch;
        compositeSwitch = null;
        boolean oldCompositeSwitchESet = compositeSwitchESet;
        compositeSwitchESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCH__COMPOSITE_SWITCH, oldCompositeSwitch, null, oldCompositeSwitchESet );
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
    public void unsetCompositeSwitch() {
        if( compositeSwitch != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) compositeSwitch ).eInverseRemove( this, CimPackage.COMPOSITE_SWITCH__SWITCHES,
                    CompositeSwitch.class, msgs );
            msgs = basicUnsetCompositeSwitch( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCompositeSwitchESet = compositeSwitchESet;
            compositeSwitchESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCH__COMPOSITE_SWITCH, null, null, oldCompositeSwitchESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCompositeSwitch() {
        return compositeSwitchESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Outage getOutage() {
        return outage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutage( Outage newOutage, NotificationChain msgs ) {
        Outage oldOutage = outage;
        outage = newOutage;
        boolean oldOutageESet = outageESet;
        outageESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH__OUTAGE,
                    oldOutage, newOutage, !oldOutageESet );
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
    public void setOutage( Outage newOutage ) {
        if( newOutage != outage ) {
            NotificationChain msgs = null;
            if( outage != null ) msgs = ( ( InternalEObject ) outage ).eInverseRemove( this,
                    CimPackage.OUTAGE__OPENED_SWITCHES, Outage.class, msgs );
            if( newOutage != null ) msgs = ( ( InternalEObject ) newOutage ).eInverseAdd( this,
                    CimPackage.OUTAGE__OPENED_SWITCHES, Outage.class, msgs );
            msgs = basicSetOutage( newOutage, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOutageESet = outageESet;
            outageESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCH__OUTAGE, newOutage, newOutage, !oldOutageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOutage( NotificationChain msgs ) {
        Outage oldOutage = outage;
        outage = null;
        boolean oldOutageESet = outageESet;
        outageESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH__OUTAGE,
                    oldOutage, null, oldOutageESet );
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
    public void unsetOutage() {
        if( outage != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) outage ).eInverseRemove( this, CimPackage.OUTAGE__OPENED_SWITCHES,
                    Outage.class, msgs );
            msgs = basicUnsetOutage( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOutageESet = outageESet;
            outageESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCH__OUTAGE, null, null, oldOutageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutage() {
        return outageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchAction getSwitchAction() {
        if( switchAction != null && switchAction.eIsProxy() ) {
            InternalEObject oldSwitchAction = ( InternalEObject ) switchAction;
            switchAction = ( SwitchAction ) eResolveProxy( oldSwitchAction );
            if( switchAction != oldSwitchAction ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.SWITCH__SWITCH_ACTION, oldSwitchAction, switchAction ) );
            }
        }
        return switchAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SwitchAction basicGetSwitchAction() {
        return switchAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSwitchAction( SwitchAction newSwitchAction, NotificationChain msgs ) {
        SwitchAction oldSwitchAction = switchAction;
        switchAction = newSwitchAction;
        boolean oldSwitchActionESet = switchActionESet;
        switchActionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCH__SWITCH_ACTION, oldSwitchAction, newSwitchAction, !oldSwitchActionESet );
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
    public void setSwitchAction( SwitchAction newSwitchAction ) {
        if( newSwitchAction != switchAction ) {
            NotificationChain msgs = null;
            if( switchAction != null ) msgs = ( ( InternalEObject ) switchAction ).eInverseRemove( this,
                    CimPackage.SWITCH_ACTION__OPERATED_SWITCH, SwitchAction.class, msgs );
            if( newSwitchAction != null ) msgs = ( ( InternalEObject ) newSwitchAction ).eInverseAdd( this,
                    CimPackage.SWITCH_ACTION__OPERATED_SWITCH, SwitchAction.class, msgs );
            msgs = basicSetSwitchAction( newSwitchAction, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchActionESet = switchActionESet;
            switchActionESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCH__SWITCH_ACTION, newSwitchAction, newSwitchAction, !oldSwitchActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSwitchAction( NotificationChain msgs ) {
        SwitchAction oldSwitchAction = switchAction;
        switchAction = null;
        boolean oldSwitchActionESet = switchActionESet;
        switchActionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCH__SWITCH_ACTION, oldSwitchAction, null, oldSwitchActionESet );
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
    public void unsetSwitchAction() {
        if( switchAction != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) switchAction ).eInverseRemove( this, CimPackage.SWITCH_ACTION__OPERATED_SWITCH,
                    SwitchAction.class, msgs );
            msgs = basicUnsetSwitchAction( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchActionESet = switchActionESet;
            switchActionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCH__SWITCH_ACTION, null, null, oldSwitchActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchAction() {
        return switchActionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConnectDisconnectFunction > getConnectDisconnectFunctions() {
        if( connectDisconnectFunctions == null ) {
            connectDisconnectFunctions = new EObjectWithInverseEList.Unsettable.ManyInverse< ConnectDisconnectFunction >(
                    ConnectDisconnectFunction.class, this, CimPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS,
                    CimPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES );
        }
        return connectDisconnectFunctions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConnectDisconnectFunctions() {
        if( connectDisconnectFunctions != null )
            ( ( InternalEList.Unsettable< ? > ) connectDisconnectFunctions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectDisconnectFunctions() {
        return connectDisconnectFunctions != null
                && ( ( InternalEList.Unsettable< ? > ) connectDisconnectFunctions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SwitchPhase > getSwitchPhase() {
        if( switchPhase == null ) {
            switchPhase = new EObjectWithInverseResolvingEList.Unsettable< SwitchPhase >( SwitchPhase.class, this,
                    CimPackage.SWITCH__SWITCH_PHASE, CimPackage.SWITCH_PHASE__SWITCH );
        }
        return switchPhase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSwitchPhase() {
        if( switchPhase != null ) ( ( InternalEList.Unsettable< ? > ) switchPhase ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchPhase() {
        return switchPhase != null && ( ( InternalEList.Unsettable< ? > ) switchPhase ).isSet();
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
        case CimPackage.SWITCH__SWITCH_SCHEDULES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSwitchSchedules() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SWITCH__COMPOSITE_SWITCH:
            if( compositeSwitch != null ) msgs = ( ( InternalEObject ) compositeSwitch ).eInverseRemove( this,
                    CimPackage.COMPOSITE_SWITCH__SWITCHES, CompositeSwitch.class, msgs );
            return basicSetCompositeSwitch( ( CompositeSwitch ) otherEnd, msgs );
        case CimPackage.SWITCH__OUTAGE:
            if( outage != null ) msgs = ( ( InternalEObject ) outage ).eInverseRemove( this,
                    CimPackage.OUTAGE__OPENED_SWITCHES, Outage.class, msgs );
            return basicSetOutage( ( Outage ) otherEnd, msgs );
        case CimPackage.SWITCH__SWITCH_ACTION:
            if( switchAction != null ) msgs = ( ( InternalEObject ) switchAction ).eInverseRemove( this,
                    CimPackage.SWITCH_ACTION__OPERATED_SWITCH, SwitchAction.class, msgs );
            return basicSetSwitchAction( ( SwitchAction ) otherEnd, msgs );
        case CimPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConnectDisconnectFunctions() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SWITCH__SWITCH_PHASE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSwitchPhase() ).basicAdd( otherEnd,
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
        case CimPackage.SWITCH__SWITCH_SCHEDULES:
            return ( ( InternalEList< ? > ) getSwitchSchedules() ).basicRemove( otherEnd, msgs );
        case CimPackage.SWITCH__COMPOSITE_SWITCH:
            return basicUnsetCompositeSwitch( msgs );
        case CimPackage.SWITCH__OUTAGE:
            return basicUnsetOutage( msgs );
        case CimPackage.SWITCH__SWITCH_ACTION:
            return basicUnsetSwitchAction( msgs );
        case CimPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
            return ( ( InternalEList< ? > ) getConnectDisconnectFunctions() ).basicRemove( otherEnd, msgs );
        case CimPackage.SWITCH__SWITCH_PHASE:
            return ( ( InternalEList< ? > ) getSwitchPhase() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.SWITCH__NORMAL_OPEN:
            return getNormalOpen();
        case CimPackage.SWITCH__OPEN:
            return getOpen();
        case CimPackage.SWITCH__RATED_CURRENT:
            return getRatedCurrent();
        case CimPackage.SWITCH__RETAINED:
            return getRetained();
        case CimPackage.SWITCH__SWITCH_ON_COUNT:
            return getSwitchOnCount();
        case CimPackage.SWITCH__SWITCH_ON_DATE:
            return getSwitchOnDate();
        case CimPackage.SWITCH__SWITCH_SCHEDULES:
            return getSwitchSchedules();
        case CimPackage.SWITCH__COMPOSITE_SWITCH:
            return getCompositeSwitch();
        case CimPackage.SWITCH__OUTAGE:
            return getOutage();
        case CimPackage.SWITCH__SWITCH_ACTION:
            if( resolve ) return getSwitchAction();
            return basicGetSwitchAction();
        case CimPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
            return getConnectDisconnectFunctions();
        case CimPackage.SWITCH__SWITCH_PHASE:
            return getSwitchPhase();
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
        case CimPackage.SWITCH__NORMAL_OPEN:
            setNormalOpen( ( Boolean ) newValue );
            return;
        case CimPackage.SWITCH__OPEN:
            setOpen( ( Boolean ) newValue );
            return;
        case CimPackage.SWITCH__RATED_CURRENT:
            setRatedCurrent( ( Float ) newValue );
            return;
        case CimPackage.SWITCH__RETAINED:
            setRetained( ( Boolean ) newValue );
            return;
        case CimPackage.SWITCH__SWITCH_ON_COUNT:
            setSwitchOnCount( ( Integer ) newValue );
            return;
        case CimPackage.SWITCH__SWITCH_ON_DATE:
            setSwitchOnDate( ( Date ) newValue );
            return;
        case CimPackage.SWITCH__SWITCH_SCHEDULES:
            getSwitchSchedules().clear();
            getSwitchSchedules().addAll( ( Collection< ? extends SwitchSchedule > ) newValue );
            return;
        case CimPackage.SWITCH__COMPOSITE_SWITCH:
            setCompositeSwitch( ( CompositeSwitch ) newValue );
            return;
        case CimPackage.SWITCH__OUTAGE:
            setOutage( ( Outage ) newValue );
            return;
        case CimPackage.SWITCH__SWITCH_ACTION:
            setSwitchAction( ( SwitchAction ) newValue );
            return;
        case CimPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
            getConnectDisconnectFunctions().clear();
            getConnectDisconnectFunctions().addAll( ( Collection< ? extends ConnectDisconnectFunction > ) newValue );
            return;
        case CimPackage.SWITCH__SWITCH_PHASE:
            getSwitchPhase().clear();
            getSwitchPhase().addAll( ( Collection< ? extends SwitchPhase > ) newValue );
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
        case CimPackage.SWITCH__NORMAL_OPEN:
            unsetNormalOpen();
            return;
        case CimPackage.SWITCH__OPEN:
            unsetOpen();
            return;
        case CimPackage.SWITCH__RATED_CURRENT:
            unsetRatedCurrent();
            return;
        case CimPackage.SWITCH__RETAINED:
            unsetRetained();
            return;
        case CimPackage.SWITCH__SWITCH_ON_COUNT:
            unsetSwitchOnCount();
            return;
        case CimPackage.SWITCH__SWITCH_ON_DATE:
            unsetSwitchOnDate();
            return;
        case CimPackage.SWITCH__SWITCH_SCHEDULES:
            unsetSwitchSchedules();
            return;
        case CimPackage.SWITCH__COMPOSITE_SWITCH:
            unsetCompositeSwitch();
            return;
        case CimPackage.SWITCH__OUTAGE:
            unsetOutage();
            return;
        case CimPackage.SWITCH__SWITCH_ACTION:
            unsetSwitchAction();
            return;
        case CimPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
            unsetConnectDisconnectFunctions();
            return;
        case CimPackage.SWITCH__SWITCH_PHASE:
            unsetSwitchPhase();
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
        case CimPackage.SWITCH__NORMAL_OPEN:
            return isSetNormalOpen();
        case CimPackage.SWITCH__OPEN:
            return isSetOpen();
        case CimPackage.SWITCH__RATED_CURRENT:
            return isSetRatedCurrent();
        case CimPackage.SWITCH__RETAINED:
            return isSetRetained();
        case CimPackage.SWITCH__SWITCH_ON_COUNT:
            return isSetSwitchOnCount();
        case CimPackage.SWITCH__SWITCH_ON_DATE:
            return isSetSwitchOnDate();
        case CimPackage.SWITCH__SWITCH_SCHEDULES:
            return isSetSwitchSchedules();
        case CimPackage.SWITCH__COMPOSITE_SWITCH:
            return isSetCompositeSwitch();
        case CimPackage.SWITCH__OUTAGE:
            return isSetOutage();
        case CimPackage.SWITCH__SWITCH_ACTION:
            return isSetSwitchAction();
        case CimPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
            return isSetConnectDisconnectFunctions();
        case CimPackage.SWITCH__SWITCH_PHASE:
            return isSetSwitchPhase();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (normalOpen: " );
        if( normalOpenESet )
            result.append( normalOpen );
        else
            result.append( "<unset>" );
        result.append( ", open: " );
        if( openESet )
            result.append( open );
        else
            result.append( "<unset>" );
        result.append( ", ratedCurrent: " );
        if( ratedCurrentESet )
            result.append( ratedCurrent );
        else
            result.append( "<unset>" );
        result.append( ", retained: " );
        if( retainedESet )
            result.append( retained );
        else
            result.append( "<unset>" );
        result.append( ", switchOnCount: " );
        if( switchOnCountESet )
            result.append( switchOnCount );
        else
            result.append( "<unset>" );
        result.append( ", switchOnDate: " );
        if( switchOnDateESet )
            result.append( switchOnDate );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SwitchImpl
