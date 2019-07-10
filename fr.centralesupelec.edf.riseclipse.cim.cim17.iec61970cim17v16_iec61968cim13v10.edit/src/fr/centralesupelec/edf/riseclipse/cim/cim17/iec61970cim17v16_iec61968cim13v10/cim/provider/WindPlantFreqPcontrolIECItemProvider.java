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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindPlantFreqPcontrolIECItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindPlantFreqPcontrolIECItemProvider( AdapterFactory adapterFactory ) {
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

            addDprefmaxPropertyDescriptor( object );
            addDprefminPropertyDescriptor( object );
            addDpwprefmaxPropertyDescriptor( object );
            addDpwprefminPropertyDescriptor( object );
            addKiwppPropertyDescriptor( object );
            addKiwppmaxPropertyDescriptor( object );
            addKiwppminPropertyDescriptor( object );
            addKpwppPropertyDescriptor( object );
            addKwpprefPropertyDescriptor( object );
            addPrefmaxPropertyDescriptor( object );
            addPrefminPropertyDescriptor( object );
            addTpftPropertyDescriptor( object );
            addTpfvPropertyDescriptor( object );
            addTwpffiltpPropertyDescriptor( object );
            addTwppfiltpPropertyDescriptor( object );
            addWindDynamicsLookupTablePropertyDescriptor( object );
            addWindPlantIECPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dprefmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDprefmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindPlantFreqPcontrolIEC_dprefmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindPlantFreqPcontrolIEC_dprefmax_feature", "_UI_WindPlantFreqPcontrolIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC_Dprefmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Dprefmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDprefminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindPlantFreqPcontrolIEC_dprefmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindPlantFreqPcontrolIEC_dprefmin_feature", "_UI_WindPlantFreqPcontrolIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC_Dprefmin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Dpwprefmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDpwprefmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindPlantFreqPcontrolIEC_dpwprefmax_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantFreqPcontrolIEC_dpwprefmax_feature",
                        "_UI_WindPlantFreqPcontrolIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC_Dpwprefmax(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Dpwprefmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDpwprefminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindPlantFreqPcontrolIEC_dpwprefmin_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantFreqPcontrolIEC_dpwprefmin_feature",
                        "_UI_WindPlantFreqPcontrolIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC_Dpwprefmin(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Kiwpp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiwppPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindPlantFreqPcontrolIEC_kiwpp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantFreqPcontrolIEC_kiwpp_feature",
                                "_UI_WindPlantFreqPcontrolIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC_Kiwpp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kiwppmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiwppmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindPlantFreqPcontrolIEC_kiwppmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindPlantFreqPcontrolIEC_kiwppmax_feature", "_UI_WindPlantFreqPcontrolIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC_Kiwppmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kiwppmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiwppminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindPlantFreqPcontrolIEC_kiwppmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindPlantFreqPcontrolIEC_kiwppmin_feature", "_UI_WindPlantFreqPcontrolIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC_Kiwppmin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kpwpp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpwppPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindPlantFreqPcontrolIEC_kpwpp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantFreqPcontrolIEC_kpwpp_feature",
                                "_UI_WindPlantFreqPcontrolIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC_Kpwpp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kwppref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKwpprefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindPlantFreqPcontrolIEC_kwppref_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantFreqPcontrolIEC_kwppref_feature",
                                "_UI_WindPlantFreqPcontrolIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC_Kwppref(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Prefmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrefmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindPlantFreqPcontrolIEC_prefmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantFreqPcontrolIEC_prefmax_feature",
                                "_UI_WindPlantFreqPcontrolIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC_Prefmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Prefmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrefminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindPlantFreqPcontrolIEC_prefmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantFreqPcontrolIEC_prefmin_feature",
                                "_UI_WindPlantFreqPcontrolIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC_Prefmin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tpft feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpftPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindPlantFreqPcontrolIEC_tpft_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantFreqPcontrolIEC_tpft_feature",
                                "_UI_WindPlantFreqPcontrolIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC_Tpft(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tpfv feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpfvPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindPlantFreqPcontrolIEC_tpfv_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantFreqPcontrolIEC_tpfv_feature",
                                "_UI_WindPlantFreqPcontrolIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC_Tpfv(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Twpffiltp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwpffiltpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindPlantFreqPcontrolIEC_twpffiltp_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindPlantFreqPcontrolIEC_twpffiltp_feature", "_UI_WindPlantFreqPcontrolIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC_Twpffiltp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Twppfiltp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwppfiltpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindPlantFreqPcontrolIEC_twppfiltp_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindPlantFreqPcontrolIEC_twppfiltp_feature", "_UI_WindPlantFreqPcontrolIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC_Twppfiltp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Dynamics Lookup Table feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindDynamicsLookupTablePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindPlantFreqPcontrolIEC_WindDynamicsLookupTable_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindPlantFreqPcontrolIEC_WindDynamicsLookupTable_feature",
                                "_UI_WindPlantFreqPcontrolIEC_type" ),
                        CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC_WindDynamicsLookupTable(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Plant IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindPlantIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindPlantFreqPcontrolIEC_WindPlantIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPlantFreqPcontrolIEC_WindPlantIEC_feature",
                        "_UI_WindPlantFreqPcontrolIEC_type" ),
                CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC_WindPlantIEC(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This returns WindPlantFreqPcontrolIEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindPlantFreqPcontrolIEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindPlantFreqPcontrolIEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindPlantFreqPcontrolIEC_type" )
                : getString( "_UI_WindPlantFreqPcontrolIEC_type" ) + " " + label;
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

        switch( notification.getFeatureID( WindPlantFreqPcontrolIEC.class ) ) {
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPREFMAX:
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPREFMIN:
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPWPREFMAX:
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPWPREFMIN:
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPP:
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPPMAX:
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPPMIN:
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KPWPP:
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KWPPREF:
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__PREFMAX:
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__PREFMIN:
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TPFT:
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TPFV:
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TWPFFILTP:
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TWPPFILTP:
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
