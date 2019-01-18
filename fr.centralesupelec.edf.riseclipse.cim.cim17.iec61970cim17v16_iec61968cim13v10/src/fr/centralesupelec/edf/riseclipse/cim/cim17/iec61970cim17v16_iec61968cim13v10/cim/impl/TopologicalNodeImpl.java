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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseVoltage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusNameMarker;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectivityNodeContainer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvInjection;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvVoltage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalIsland;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode;

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
 * An implementation of the model object '<em><b>Topological Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TopologicalNodeImpl#getPInjection <em>PInjection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TopologicalNodeImpl#getQInjection <em>QInjection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TopologicalNodeImpl#getConnectivityNodes <em>Connectivity Nodes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TopologicalNodeImpl#getSvInjection <em>Sv Injection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TopologicalNodeImpl#getBusNameMarker <em>Bus Name Marker</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TopologicalNodeImpl#getAngleRefTopologicalIsland <em>Angle Ref Topological Island</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TopologicalNodeImpl#getReportingGroup <em>Reporting Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TopologicalNodeImpl#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TopologicalNodeImpl#getTopologicalIsland <em>Topological Island</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TopologicalNodeImpl#getSvVoltage <em>Sv Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TopologicalNodeImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TopologicalNodeImpl#getConnectivityNodeContainer <em>Connectivity Node Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopologicalNodeImpl extends IdentifiedObjectImpl implements TopologicalNode {
    /**
     * The default value of the '{@link #getPInjection() <em>PInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPInjection()
     * @generated
     * @ordered
     */
    protected static final Float PINJECTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPInjection() <em>PInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPInjection()
     * @generated
     * @ordered
     */
    protected Float pInjection = PINJECTION_EDEFAULT;

    /**
     * This is true if the PInjection attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pInjectionESet;

    /**
     * The default value of the '{@link #getQInjection() <em>QInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQInjection()
     * @generated
     * @ordered
     */
    protected static final Float QINJECTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQInjection() <em>QInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQInjection()
     * @generated
     * @ordered
     */
    protected Float qInjection = QINJECTION_EDEFAULT;

    /**
     * This is true if the QInjection attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qInjectionESet;

    /**
     * The cached value of the '{@link #getConnectivityNodes() <em>Connectivity Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectivityNodes()
     * @generated
     * @ordered
     */
    protected EList< ConnectivityNode > connectivityNodes;

    /**
     * The cached value of the '{@link #getSvInjection() <em>Sv Injection</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvInjection()
     * @generated
     * @ordered
     */
    protected EList< SvInjection > svInjection;

    /**
     * The cached value of the '{@link #getBusNameMarker() <em>Bus Name Marker</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBusNameMarker()
     * @generated
     * @ordered
     */
    protected EList< BusNameMarker > busNameMarker;

    /**
     * The cached value of the '{@link #getAngleRefTopologicalIsland() <em>Angle Ref Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAngleRefTopologicalIsland()
     * @generated
     * @ordered
     */
    protected TopologicalIsland angleRefTopologicalIsland;

    /**
     * This is true if the Angle Ref Topological Island reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean angleRefTopologicalIslandESet;

    /**
     * The cached value of the '{@link #getReportingGroup() <em>Reporting Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportingGroup()
     * @generated
     * @ordered
     */
    protected ReportingGroup reportingGroup;

    /**
     * This is true if the Reporting Group reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reportingGroupESet;

    /**
     * The cached value of the '{@link #getBaseVoltage() <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseVoltage()
     * @generated
     * @ordered
     */
    protected BaseVoltage baseVoltage;

    /**
     * This is true if the Base Voltage reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean baseVoltageESet;

    /**
     * The cached value of the '{@link #getTopologicalIsland() <em>Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTopologicalIsland()
     * @generated
     * @ordered
     */
    protected TopologicalIsland topologicalIsland;

    /**
     * This is true if the Topological Island reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean topologicalIslandESet;

    /**
     * The cached value of the '{@link #getSvVoltage() <em>Sv Voltage</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvVoltage()
     * @generated
     * @ordered
     */
    protected EList< SvVoltage > svVoltage;

    /**
     * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminal()
     * @generated
     * @ordered
     */
    protected EList< Terminal > terminal;

    /**
     * The cached value of the '{@link #getConnectivityNodeContainer() <em>Connectivity Node Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectivityNodeContainer()
     * @generated
     * @ordered
     */
    protected ConnectivityNodeContainer connectivityNodeContainer;

    /**
     * This is true if the Connectivity Node Container reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean connectivityNodeContainerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TopologicalNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTopologicalNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPInjection() {
        return pInjection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPInjection( Float newPInjection ) {
        Float oldPInjection = pInjection;
        pInjection = newPInjection;
        boolean oldPInjectionESet = pInjectionESet;
        pInjectionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TOPOLOGICAL_NODE__PINJECTION, oldPInjection, pInjection, !oldPInjectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPInjection() {
        Float oldPInjection = pInjection;
        boolean oldPInjectionESet = pInjectionESet;
        pInjection = PINJECTION_EDEFAULT;
        pInjectionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TOPOLOGICAL_NODE__PINJECTION, oldPInjection, PINJECTION_EDEFAULT, oldPInjectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPInjection() {
        return pInjectionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQInjection() {
        return qInjection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQInjection( Float newQInjection ) {
        Float oldQInjection = qInjection;
        qInjection = newQInjection;
        boolean oldQInjectionESet = qInjectionESet;
        qInjectionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TOPOLOGICAL_NODE__QINJECTION, oldQInjection, qInjection, !oldQInjectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQInjection() {
        Float oldQInjection = qInjection;
        boolean oldQInjectionESet = qInjectionESet;
        qInjection = QINJECTION_EDEFAULT;
        qInjectionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TOPOLOGICAL_NODE__QINJECTION, oldQInjection, QINJECTION_EDEFAULT, oldQInjectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQInjection() {
        return qInjectionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConnectivityNode > getConnectivityNodes() {
        if( connectivityNodes == null ) {
            connectivityNodes = new EObjectWithInverseResolvingEList.Unsettable< ConnectivityNode >(
                    ConnectivityNode.class, this, CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES,
                    CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE );
        }
        return connectivityNodes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConnectivityNodes() {
        if( connectivityNodes != null ) ( ( InternalEList.Unsettable< ? > ) connectivityNodes ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectivityNodes() {
        return connectivityNodes != null && ( ( InternalEList.Unsettable< ? > ) connectivityNodes ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SvInjection > getSvInjection() {
        if( svInjection == null ) {
            svInjection = new EObjectWithInverseResolvingEList.Unsettable< SvInjection >( SvInjection.class, this,
                    CimPackage.TOPOLOGICAL_NODE__SV_INJECTION, CimPackage.SV_INJECTION__TOPOLOGICAL_NODE );
        }
        return svInjection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSvInjection() {
        if( svInjection != null ) ( ( InternalEList.Unsettable< ? > ) svInjection ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSvInjection() {
        return svInjection != null && ( ( InternalEList.Unsettable< ? > ) svInjection ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< BusNameMarker > getBusNameMarker() {
        if( busNameMarker == null ) {
            busNameMarker = new EObjectWithInverseResolvingEList.Unsettable< BusNameMarker >( BusNameMarker.class, this,
                    CimPackage.TOPOLOGICAL_NODE__BUS_NAME_MARKER, CimPackage.BUS_NAME_MARKER__TOPOLOGICAL_NODE );
        }
        return busNameMarker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBusNameMarker() {
        if( busNameMarker != null ) ( ( InternalEList.Unsettable< ? > ) busNameMarker ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBusNameMarker() {
        return busNameMarker != null && ( ( InternalEList.Unsettable< ? > ) busNameMarker ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TopologicalIsland getAngleRefTopologicalIsland() {
        if( angleRefTopologicalIsland != null && angleRefTopologicalIsland.eIsProxy() ) {
            InternalEObject oldAngleRefTopologicalIsland = ( InternalEObject ) angleRefTopologicalIsland;
            angleRefTopologicalIsland = ( TopologicalIsland ) eResolveProxy( oldAngleRefTopologicalIsland );
            if( angleRefTopologicalIsland != oldAngleRefTopologicalIsland ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, oldAngleRefTopologicalIsland,
                        angleRefTopologicalIsland ) );
            }
        }
        return angleRefTopologicalIsland;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TopologicalIsland basicGetAngleRefTopologicalIsland() {
        return angleRefTopologicalIsland;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAngleRefTopologicalIsland( TopologicalIsland newAngleRefTopologicalIsland,
            NotificationChain msgs ) {
        TopologicalIsland oldAngleRefTopologicalIsland = angleRefTopologicalIsland;
        angleRefTopologicalIsland = newAngleRefTopologicalIsland;
        boolean oldAngleRefTopologicalIslandESet = angleRefTopologicalIslandESet;
        angleRefTopologicalIslandESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, oldAngleRefTopologicalIsland,
                    newAngleRefTopologicalIsland, !oldAngleRefTopologicalIslandESet );
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
    public void setAngleRefTopologicalIsland( TopologicalIsland newAngleRefTopologicalIsland ) {
        if( newAngleRefTopologicalIsland != angleRefTopologicalIsland ) {
            NotificationChain msgs = null;
            if( angleRefTopologicalIsland != null )
                msgs = ( ( InternalEObject ) angleRefTopologicalIsland ).eInverseRemove( this,
                        CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, TopologicalIsland.class, msgs );
            if( newAngleRefTopologicalIsland != null )
                msgs = ( ( InternalEObject ) newAngleRefTopologicalIsland ).eInverseAdd( this,
                        CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, TopologicalIsland.class, msgs );
            msgs = basicSetAngleRefTopologicalIsland( newAngleRefTopologicalIsland, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAngleRefTopologicalIslandESet = angleRefTopologicalIslandESet;
            angleRefTopologicalIslandESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, newAngleRefTopologicalIsland,
                    newAngleRefTopologicalIsland, !oldAngleRefTopologicalIslandESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAngleRefTopologicalIsland( NotificationChain msgs ) {
        TopologicalIsland oldAngleRefTopologicalIsland = angleRefTopologicalIsland;
        angleRefTopologicalIsland = null;
        boolean oldAngleRefTopologicalIslandESet = angleRefTopologicalIslandESet;
        angleRefTopologicalIslandESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, oldAngleRefTopologicalIsland, null,
                    oldAngleRefTopologicalIslandESet );
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
    public void unsetAngleRefTopologicalIsland() {
        if( angleRefTopologicalIsland != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) angleRefTopologicalIsland ).eInverseRemove( this,
                    CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, TopologicalIsland.class, msgs );
            msgs = basicUnsetAngleRefTopologicalIsland( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAngleRefTopologicalIslandESet = angleRefTopologicalIslandESet;
            angleRefTopologicalIslandESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, null, null,
                    oldAngleRefTopologicalIslandESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAngleRefTopologicalIsland() {
        return angleRefTopologicalIslandESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReportingGroup getReportingGroup() {
        return reportingGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReportingGroup( ReportingGroup newReportingGroup, NotificationChain msgs ) {
        ReportingGroup oldReportingGroup = reportingGroup;
        reportingGroup = newReportingGroup;
        boolean oldReportingGroupESet = reportingGroupESet;
        reportingGroupESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP, oldReportingGroup, newReportingGroup,
                    !oldReportingGroupESet );
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
    public void setReportingGroup( ReportingGroup newReportingGroup ) {
        if( newReportingGroup != reportingGroup ) {
            NotificationChain msgs = null;
            if( reportingGroup != null ) msgs = ( ( InternalEObject ) reportingGroup ).eInverseRemove( this,
                    CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE, ReportingGroup.class, msgs );
            if( newReportingGroup != null ) msgs = ( ( InternalEObject ) newReportingGroup ).eInverseAdd( this,
                    CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE, ReportingGroup.class, msgs );
            msgs = basicSetReportingGroup( newReportingGroup, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReportingGroupESet = reportingGroupESet;
            reportingGroupESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP,
                        newReportingGroup, newReportingGroup, !oldReportingGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReportingGroup( NotificationChain msgs ) {
        ReportingGroup oldReportingGroup = reportingGroup;
        reportingGroup = null;
        boolean oldReportingGroupESet = reportingGroupESet;
        reportingGroupESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP, oldReportingGroup, null, oldReportingGroupESet );
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
    public void unsetReportingGroup() {
        if( reportingGroup != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) reportingGroup ).eInverseRemove( this,
                    CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE, ReportingGroup.class, msgs );
            msgs = basicUnsetReportingGroup( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReportingGroupESet = reportingGroupESet;
            reportingGroupESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP, null, null, oldReportingGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReportingGroup() {
        return reportingGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BaseVoltage getBaseVoltage() {
        return baseVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBaseVoltage( BaseVoltage newBaseVoltage, NotificationChain msgs ) {
        BaseVoltage oldBaseVoltage = baseVoltage;
        baseVoltage = newBaseVoltage;
        boolean oldBaseVoltageESet = baseVoltageESet;
        baseVoltageESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE, oldBaseVoltage, newBaseVoltage, !oldBaseVoltageESet );
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
    public void setBaseVoltage( BaseVoltage newBaseVoltage ) {
        if( newBaseVoltage != baseVoltage ) {
            NotificationChain msgs = null;
            if( baseVoltage != null ) msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                    CimPackage.BASE_VOLTAGE__TOPOLOGICAL_NODE, BaseVoltage.class, msgs );
            if( newBaseVoltage != null ) msgs = ( ( InternalEObject ) newBaseVoltage ).eInverseAdd( this,
                    CimPackage.BASE_VOLTAGE__TOPOLOGICAL_NODE, BaseVoltage.class, msgs );
            msgs = basicSetBaseVoltage( newBaseVoltage, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseVoltageESet = baseVoltageESet;
            baseVoltageESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE, newBaseVoltage, newBaseVoltage, !oldBaseVoltageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBaseVoltage( NotificationChain msgs ) {
        BaseVoltage oldBaseVoltage = baseVoltage;
        baseVoltage = null;
        boolean oldBaseVoltageESet = baseVoltageESet;
        baseVoltageESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE, oldBaseVoltage, null, oldBaseVoltageESet );
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
    public void unsetBaseVoltage() {
        if( baseVoltage != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this, CimPackage.BASE_VOLTAGE__TOPOLOGICAL_NODE,
                    BaseVoltage.class, msgs );
            msgs = basicUnsetBaseVoltage( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseVoltageESet = baseVoltageESet;
            baseVoltageESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE, null, null, oldBaseVoltageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBaseVoltage() {
        return baseVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TopologicalIsland getTopologicalIsland() {
        return topologicalIsland;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTopologicalIsland( TopologicalIsland newTopologicalIsland,
            NotificationChain msgs ) {
        TopologicalIsland oldTopologicalIsland = topologicalIsland;
        topologicalIsland = newTopologicalIsland;
        boolean oldTopologicalIslandESet = topologicalIslandESet;
        topologicalIslandESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND, oldTopologicalIsland, newTopologicalIsland,
                    !oldTopologicalIslandESet );
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
    public void setTopologicalIsland( TopologicalIsland newTopologicalIsland ) {
        if( newTopologicalIsland != topologicalIsland ) {
            NotificationChain msgs = null;
            if( topologicalIsland != null ) msgs = ( ( InternalEObject ) topologicalIsland ).eInverseRemove( this,
                    CimPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES, TopologicalIsland.class, msgs );
            if( newTopologicalIsland != null ) msgs = ( ( InternalEObject ) newTopologicalIsland ).eInverseAdd( this,
                    CimPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES, TopologicalIsland.class, msgs );
            msgs = basicSetTopologicalIsland( newTopologicalIsland, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTopologicalIslandESet = topologicalIslandESet;
            topologicalIslandESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND,
                        newTopologicalIsland, newTopologicalIsland, !oldTopologicalIslandESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTopologicalIsland( NotificationChain msgs ) {
        TopologicalIsland oldTopologicalIsland = topologicalIsland;
        topologicalIsland = null;
        boolean oldTopologicalIslandESet = topologicalIslandESet;
        topologicalIslandESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND, oldTopologicalIsland, null,
                    oldTopologicalIslandESet );
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
    public void unsetTopologicalIsland() {
        if( topologicalIsland != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) topologicalIsland ).eInverseRemove( this,
                    CimPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES, TopologicalIsland.class, msgs );
            msgs = basicUnsetTopologicalIsland( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTopologicalIslandESet = topologicalIslandESet;
            topologicalIslandESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND, null, null, oldTopologicalIslandESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTopologicalIsland() {
        return topologicalIslandESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SvVoltage > getSvVoltage() {
        if( svVoltage == null ) {
            svVoltage = new EObjectWithInverseResolvingEList.Unsettable< SvVoltage >( SvVoltage.class, this,
                    CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE, CimPackage.SV_VOLTAGE__TOPOLOGICAL_NODE );
        }
        return svVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSvVoltage() {
        if( svVoltage != null ) ( ( InternalEList.Unsettable< ? > ) svVoltage ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSvVoltage() {
        return svVoltage != null && ( ( InternalEList.Unsettable< ? > ) svVoltage ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Terminal > getTerminal() {
        if( terminal == null ) {
            terminal = new EObjectWithInverseResolvingEList.Unsettable< Terminal >( Terminal.class, this,
                    CimPackage.TOPOLOGICAL_NODE__TERMINAL, CimPackage.TERMINAL__TOPOLOGICAL_NODE );
        }
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTerminal() {
        if( terminal != null ) ( ( InternalEList.Unsettable< ? > ) terminal ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTerminal() {
        return terminal != null && ( ( InternalEList.Unsettable< ? > ) terminal ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConnectivityNodeContainer getConnectivityNodeContainer() {
        return connectivityNodeContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConnectivityNodeContainer( ConnectivityNodeContainer newConnectivityNodeContainer,
            NotificationChain msgs ) {
        ConnectivityNodeContainer oldConnectivityNodeContainer = connectivityNodeContainer;
        connectivityNodeContainer = newConnectivityNodeContainer;
        boolean oldConnectivityNodeContainerESet = connectivityNodeContainerESet;
        connectivityNodeContainerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER, oldConnectivityNodeContainer,
                    newConnectivityNodeContainer, !oldConnectivityNodeContainerESet );
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
    public void setConnectivityNodeContainer( ConnectivityNodeContainer newConnectivityNodeContainer ) {
        if( newConnectivityNodeContainer != connectivityNodeContainer ) {
            NotificationChain msgs = null;
            if( connectivityNodeContainer != null )
                msgs = ( ( InternalEObject ) connectivityNodeContainer ).eInverseRemove( this,
                        CimPackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE, ConnectivityNodeContainer.class,
                        msgs );
            if( newConnectivityNodeContainer != null )
                msgs = ( ( InternalEObject ) newConnectivityNodeContainer ).eInverseAdd( this,
                        CimPackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE, ConnectivityNodeContainer.class,
                        msgs );
            msgs = basicSetConnectivityNodeContainer( newConnectivityNodeContainer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConnectivityNodeContainerESet = connectivityNodeContainerESet;
            connectivityNodeContainerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER, newConnectivityNodeContainer,
                    newConnectivityNodeContainer, !oldConnectivityNodeContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetConnectivityNodeContainer( NotificationChain msgs ) {
        ConnectivityNodeContainer oldConnectivityNodeContainer = connectivityNodeContainer;
        connectivityNodeContainer = null;
        boolean oldConnectivityNodeContainerESet = connectivityNodeContainerESet;
        connectivityNodeContainerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER, oldConnectivityNodeContainer, null,
                    oldConnectivityNodeContainerESet );
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
    public void unsetConnectivityNodeContainer() {
        if( connectivityNodeContainer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) connectivityNodeContainer ).eInverseRemove( this,
                    CimPackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE, ConnectivityNodeContainer.class, msgs );
            msgs = basicUnsetConnectivityNodeContainer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConnectivityNodeContainerESet = connectivityNodeContainerESet;
            connectivityNodeContainerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER, null, null,
                    oldConnectivityNodeContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectivityNodeContainer() {
        return connectivityNodeContainerESet;
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
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConnectivityNodes() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__SV_INJECTION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSvInjection() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.TOPOLOGICAL_NODE__BUS_NAME_MARKER:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getBusNameMarker() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
            if( angleRefTopologicalIsland != null )
                msgs = ( ( InternalEObject ) angleRefTopologicalIsland ).eInverseRemove( this,
                        CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, TopologicalIsland.class, msgs );
            return basicSetAngleRefTopologicalIsland( ( TopologicalIsland ) otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
            if( reportingGroup != null ) msgs = ( ( InternalEObject ) reportingGroup ).eInverseRemove( this,
                    CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE, ReportingGroup.class, msgs );
            return basicSetReportingGroup( ( ReportingGroup ) otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
            if( baseVoltage != null ) msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                    CimPackage.BASE_VOLTAGE__TOPOLOGICAL_NODE, BaseVoltage.class, msgs );
            return basicSetBaseVoltage( ( BaseVoltage ) otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
            if( topologicalIsland != null ) msgs = ( ( InternalEObject ) topologicalIsland ).eInverseRemove( this,
                    CimPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES, TopologicalIsland.class, msgs );
            return basicSetTopologicalIsland( ( TopologicalIsland ) otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSvVoltage() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.TOPOLOGICAL_NODE__TERMINAL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTerminal() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
            if( connectivityNodeContainer != null )
                msgs = ( ( InternalEObject ) connectivityNodeContainer ).eInverseRemove( this,
                        CimPackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE, ConnectivityNodeContainer.class,
                        msgs );
            return basicSetConnectivityNodeContainer( ( ConnectivityNodeContainer ) otherEnd, msgs );
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
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
            return ( ( InternalEList< ? > ) getConnectivityNodes() ).basicRemove( otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__SV_INJECTION:
            return ( ( InternalEList< ? > ) getSvInjection() ).basicRemove( otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__BUS_NAME_MARKER:
            return ( ( InternalEList< ? > ) getBusNameMarker() ).basicRemove( otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
            return basicUnsetAngleRefTopologicalIsland( msgs );
        case CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
            return basicUnsetReportingGroup( msgs );
        case CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
            return basicUnsetBaseVoltage( msgs );
        case CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
            return basicUnsetTopologicalIsland( msgs );
        case CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
            return ( ( InternalEList< ? > ) getSvVoltage() ).basicRemove( otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__TERMINAL:
            return ( ( InternalEList< ? > ) getTerminal() ).basicRemove( otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
            return basicUnsetConnectivityNodeContainer( msgs );
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
        case CimPackage.TOPOLOGICAL_NODE__PINJECTION:
            return getPInjection();
        case CimPackage.TOPOLOGICAL_NODE__QINJECTION:
            return getQInjection();
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
            return getConnectivityNodes();
        case CimPackage.TOPOLOGICAL_NODE__SV_INJECTION:
            return getSvInjection();
        case CimPackage.TOPOLOGICAL_NODE__BUS_NAME_MARKER:
            return getBusNameMarker();
        case CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
            if( resolve ) return getAngleRefTopologicalIsland();
            return basicGetAngleRefTopologicalIsland();
        case CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
            return getReportingGroup();
        case CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
            return getBaseVoltage();
        case CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
            return getTopologicalIsland();
        case CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
            return getSvVoltage();
        case CimPackage.TOPOLOGICAL_NODE__TERMINAL:
            return getTerminal();
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
            return getConnectivityNodeContainer();
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
        case CimPackage.TOPOLOGICAL_NODE__PINJECTION:
            setPInjection( ( Float ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__QINJECTION:
            setQInjection( ( Float ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
            getConnectivityNodes().clear();
            getConnectivityNodes().addAll( ( Collection< ? extends ConnectivityNode > ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__SV_INJECTION:
            getSvInjection().clear();
            getSvInjection().addAll( ( Collection< ? extends SvInjection > ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__BUS_NAME_MARKER:
            getBusNameMarker().clear();
            getBusNameMarker().addAll( ( Collection< ? extends BusNameMarker > ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
            setAngleRefTopologicalIsland( ( TopologicalIsland ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
            setReportingGroup( ( ReportingGroup ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
            setBaseVoltage( ( BaseVoltage ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
            setTopologicalIsland( ( TopologicalIsland ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
            getSvVoltage().clear();
            getSvVoltage().addAll( ( Collection< ? extends SvVoltage > ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__TERMINAL:
            getTerminal().clear();
            getTerminal().addAll( ( Collection< ? extends Terminal > ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
            setConnectivityNodeContainer( ( ConnectivityNodeContainer ) newValue );
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
        case CimPackage.TOPOLOGICAL_NODE__PINJECTION:
            unsetPInjection();
            return;
        case CimPackage.TOPOLOGICAL_NODE__QINJECTION:
            unsetQInjection();
            return;
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
            unsetConnectivityNodes();
            return;
        case CimPackage.TOPOLOGICAL_NODE__SV_INJECTION:
            unsetSvInjection();
            return;
        case CimPackage.TOPOLOGICAL_NODE__BUS_NAME_MARKER:
            unsetBusNameMarker();
            return;
        case CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
            unsetAngleRefTopologicalIsland();
            return;
        case CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
            unsetReportingGroup();
            return;
        case CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
            unsetBaseVoltage();
            return;
        case CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
            unsetTopologicalIsland();
            return;
        case CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
            unsetSvVoltage();
            return;
        case CimPackage.TOPOLOGICAL_NODE__TERMINAL:
            unsetTerminal();
            return;
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
            unsetConnectivityNodeContainer();
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
        case CimPackage.TOPOLOGICAL_NODE__PINJECTION:
            return isSetPInjection();
        case CimPackage.TOPOLOGICAL_NODE__QINJECTION:
            return isSetQInjection();
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
            return isSetConnectivityNodes();
        case CimPackage.TOPOLOGICAL_NODE__SV_INJECTION:
            return isSetSvInjection();
        case CimPackage.TOPOLOGICAL_NODE__BUS_NAME_MARKER:
            return isSetBusNameMarker();
        case CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
            return isSetAngleRefTopologicalIsland();
        case CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
            return isSetReportingGroup();
        case CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
            return isSetBaseVoltage();
        case CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
            return isSetTopologicalIsland();
        case CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
            return isSetSvVoltage();
        case CimPackage.TOPOLOGICAL_NODE__TERMINAL:
            return isSetTerminal();
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
            return isSetConnectivityNodeContainer();
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
        result.append( " (pInjection: " );
        if( pInjectionESet )
            result.append( pInjection );
        else
            result.append( "<unset>" );
        result.append( ", qInjection: " );
        if( qInjectionESet )
            result.append( qInjection );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TopologicalNodeImpl
