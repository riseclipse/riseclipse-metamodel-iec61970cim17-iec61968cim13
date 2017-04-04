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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantReactiveControlIEC;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantReactiveControlIEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindPlantReactiveControlIECItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindPlantReactiveControlIECItemProvider( AdapterFactory adapterFactory ) {
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

            addDxrefmaxPropertyDescriptor( object );
            addDxrefminPropertyDescriptor( object );
            addKiwpxPropertyDescriptor( object );
            addKiwpxmaxPropertyDescriptor( object );
            addKiwpxminPropertyDescriptor( object );
            addKpwpxPropertyDescriptor( object );
            addKwpqrefPropertyDescriptor( object );
            addKwpquPropertyDescriptor( object );
            addTuqfiltPropertyDescriptor( object );
            addTwppfiltqPropertyDescriptor( object );
            addTwpqfiltqPropertyDescriptor( object );
            addTwpufiltqPropertyDescriptor( object );
            addTxftPropertyDescriptor( object );
            addTxfvPropertyDescriptor( object );
            addUwpqdipPropertyDescriptor( object );
            addWindPlantQcontrolModesTypePropertyDescriptor( object );
            addXrefmaxPropertyDescriptor( object );
            addXrefminPropertyDescriptor( object );
            addWindPlantIECPropertyDescriptor( object );
            addWindDynamicsLookupTablePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dxrefmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDxrefmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_dxrefmax_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_dxrefmax_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Dxrefmax(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dxrefmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDxrefminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_dxrefmin_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_dxrefmin_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Dxrefmin(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kiwpx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiwpxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_kiwpx_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_kiwpx_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Kiwpx(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kiwpxmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiwpxmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_kiwpxmax_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_kiwpxmax_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Kiwpxmax(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kiwpxmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiwpxminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_kiwpxmin_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_kiwpxmin_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Kiwpxmin(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kpwpx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpwpxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_kpwpx_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_kpwpx_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Kpwpx(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kwpqref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKwpqrefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_kwpqref_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_kwpqref_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Kwpqref(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kwpqu feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKwpquPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_kwpqu_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_kwpqu_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Kwpqu(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tuqfilt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTuqfiltPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_tuqfilt_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_tuqfilt_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Tuqfilt(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Twppfiltq feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwppfiltqPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_twppfiltq_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_twppfiltq_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Twppfiltq(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Twpqfiltq feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwpqfiltqPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_twpqfiltq_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_twpqfiltq_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Twpqfiltq(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Twpufiltq feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwpufiltqPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_twpufiltq_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_twpufiltq_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Twpufiltq(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Txft feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTxftPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindPlantReactiveControlIEC_txft_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_txft_feature",
                                "_UI_WindPlantReactiveControlIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Txft(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Txfv feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTxfvPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindPlantReactiveControlIEC_txfv_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_txfv_feature",
                                "_UI_WindPlantReactiveControlIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Txfv(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Uwpqdip feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUwpqdipPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_uwpqdip_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_uwpqdip_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Uwpqdip(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Plant Qcontrol Modes Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindPlantQcontrolModesTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_windPlantQcontrolModesType_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindPlantReactiveControlIEC_windPlantQcontrolModesType_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_WindPlantQcontrolModesType(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xrefmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXrefmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_xrefmax_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_xrefmax_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Xrefmax(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xrefmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXrefminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_xrefmin_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_xrefmin_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_Xrefmin(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Plant IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindPlantIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_WindPlantIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantReactiveControlIEC_WindPlantIEC_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_WindPlantIEC(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Wind Dynamics Lookup Table feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindDynamicsLookupTablePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPlantReactiveControlIEC_WindDynamicsLookupTable_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindPlantReactiveControlIEC_WindDynamicsLookupTable_feature",
                        "_UI_WindPlantReactiveControlIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantReactiveControlIEC_WindDynamicsLookupTable(), true, false, true, null,
                null, null ) );
    }

    /**
     * This returns WindPlantReactiveControlIEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindPlantReactiveControlIEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindPlantReactiveControlIEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindPlantReactiveControlIEC_type" )
                : getString( "_UI_WindPlantReactiveControlIEC_type" ) + " " + label;
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

        switch( notification.getFeatureID( WindPlantReactiveControlIEC.class ) ) {
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__DXREFMAX:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__DXREFMIN:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPX:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPXMAX:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPXMIN:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KPWPX:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQREF:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQU:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TUQFILT:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPPFILTQ:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPQFILTQ:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPUFILTQ:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFT:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFV:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__UWPQDIP:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_QCONTROL_MODES_TYPE:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMAX:
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMIN:
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
