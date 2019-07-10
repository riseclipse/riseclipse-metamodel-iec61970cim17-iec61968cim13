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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContQIEC;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContQIEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindContQIECItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindContQIECItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addIqh1PropertyDescriptor( object );
            addIqmaxPropertyDescriptor( object );
            addIqminPropertyDescriptor( object );
            addIqpostPropertyDescriptor( object );
            addKiqPropertyDescriptor( object );
            addKiuPropertyDescriptor( object );
            addKpqPropertyDescriptor( object );
            addKpuPropertyDescriptor( object );
            addKqvPropertyDescriptor( object );
            addRdroopPropertyDescriptor( object );
            addTpfiltqPropertyDescriptor( object );
            addTpostPropertyDescriptor( object );
            addTqordPropertyDescriptor( object );
            addTufiltqPropertyDescriptor( object );
            addUdb1PropertyDescriptor( object );
            addUdb2PropertyDescriptor( object );
            addUmaxPropertyDescriptor( object );
            addUminPropertyDescriptor( object );
            addUqdipPropertyDescriptor( object );
            addUref0PropertyDescriptor( object );
            addWindQcontrolModesTypePropertyDescriptor( object );
            addWindUVRTQcontrolModesTypePropertyDescriptor( object );
            addXdroopPropertyDescriptor( object );
            addWindTurbineType3or4IECPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Iqh1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIqh1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_iqh1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_iqh1_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Iqh1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Iqmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIqmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_iqmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_iqmax_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Iqmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Iqmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIqminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_iqmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_iqmin_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Iqmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Iqpost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIqpostPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_iqpost_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_iqpost_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Iqpost(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kiq feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiqPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_kiq_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_kiq_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Kiq(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kiu feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiuPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_kiu_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_kiu_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Kiu(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kpq feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpqPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_kpq_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_kpq_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Kpq(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kpu feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpuPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_kpu_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_kpu_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Kpu(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kqv feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKqvPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_kqv_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_kqv_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Kqv(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rdroop feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRdroopPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_rdroop_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_rdroop_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Rdroop(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tpfiltq feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpfiltqPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_tpfiltq_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_tpfiltq_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Tpfiltq(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tpost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpostPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_tpost_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_tpost_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Tpost(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tqord feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTqordPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_tqord_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_tqord_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Tqord(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tufiltq feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTufiltqPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_tufiltq_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_tufiltq_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Tufiltq(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Udb1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUdb1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_udb1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_udb1_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Udb1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Udb2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUdb2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_udb2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_udb2_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Udb2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Umax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_umax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_umax_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Umax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Umin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_umin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_umin_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Umin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Uqdip feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUqdipPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_uqdip_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_uqdip_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Uqdip(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Uref0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUref0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_uref0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_uref0_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Uref0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Qcontrol Modes Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindQcontrolModesTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindContQIEC_windQcontrolModesType_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_windQcontrolModesType_feature",
                        "_UI_WindContQIEC_type" ),
                CimPackage.eINSTANCE.getWindContQIEC_WindQcontrolModesType(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind UVRT Qcontrol Modes Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindUVRTQcontrolModesTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindContQIEC_windUVRTQcontrolModesType_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_windUVRTQcontrolModesType_feature",
                        "_UI_WindContQIEC_type" ),
                CimPackage.eINSTANCE.getWindContQIEC_WindUVRTQcontrolModesType(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xdroop feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXdroopPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContQIEC_xdroop_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_xdroop_feature",
                                "_UI_WindContQIEC_type" ),
                        CimPackage.eINSTANCE.getWindContQIEC_Xdroop(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Turbine Type3or4 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindTurbineType3or4IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindContQIEC_WindTurbineType3or4IEC_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindContQIEC_WindTurbineType3or4IEC_feature",
                        "_UI_WindContQIEC_type" ),
                CimPackage.eINSTANCE.getWindContQIEC_WindTurbineType3or4IEC(), true, false, true, null, null, null ) );
    }

    /**
     * This returns WindContQIEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindContQIEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindContQIEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindContQIEC_type" )
                : getString( "_UI_WindContQIEC_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( WindContQIEC.class ) ) {
        case CimPackage.WIND_CONT_QIEC__IQH1:
        case CimPackage.WIND_CONT_QIEC__IQMAX:
        case CimPackage.WIND_CONT_QIEC__IQMIN:
        case CimPackage.WIND_CONT_QIEC__IQPOST:
        case CimPackage.WIND_CONT_QIEC__KIQ:
        case CimPackage.WIND_CONT_QIEC__KIU:
        case CimPackage.WIND_CONT_QIEC__KPQ:
        case CimPackage.WIND_CONT_QIEC__KPU:
        case CimPackage.WIND_CONT_QIEC__KQV:
        case CimPackage.WIND_CONT_QIEC__RDROOP:
        case CimPackage.WIND_CONT_QIEC__TPFILTQ:
        case CimPackage.WIND_CONT_QIEC__TPOST:
        case CimPackage.WIND_CONT_QIEC__TQORD:
        case CimPackage.WIND_CONT_QIEC__TUFILTQ:
        case CimPackage.WIND_CONT_QIEC__UDB1:
        case CimPackage.WIND_CONT_QIEC__UDB2:
        case CimPackage.WIND_CONT_QIEC__UMAX:
        case CimPackage.WIND_CONT_QIEC__UMIN:
        case CimPackage.WIND_CONT_QIEC__UQDIP:
        case CimPackage.WIND_CONT_QIEC__UREF0:
        case CimPackage.WIND_CONT_QIEC__WIND_QCONTROL_MODES_TYPE:
        case CimPackage.WIND_CONT_QIEC__WIND_UVRT_QCONTROL_MODES_TYPE:
        case CimPackage.WIND_CONT_QIEC__XDROOP:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
